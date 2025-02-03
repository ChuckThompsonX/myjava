package myjava.streams;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileWriteRead {

	public static void main(String[] args) {

		String[] words = { "hello", "refer", "world", "level" };

		// write words to file
		try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(new URI("file:///temp/myFile.txt"))))) {
			Stream.of(words).forEach(pw::println);
		} 
		catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}

		Stream<String> stream = null;
		try {
			stream = Files.lines(Paths.get(new URI("file:///temp/myFile.txt")));
		} 
		catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}

		// only retrieve the palindromes from the file
		List<String> theWords = stream.filter(s -> s.length() == 5)
				.filter(s -> s.compareToIgnoreCase(new StringBuilder(s).reverse().toString()) == 0)
				.toList();

		theWords.stream().forEach(System.out::println);
	}
}
