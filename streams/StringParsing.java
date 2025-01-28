package myjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringParsing {

	public static void main(String[] args) {
		
		String str = "50 60 70";
    Scanner scanner = new Scanner(str); // for formatted strings
    while (scanner.hasNextInt()) { System.out.println(scanner.nextInt()); }
    scanner.close();
        
		// regular expressions for complex pattern matching
    str = "Email: joe.doe@example.com";
    Pattern pattern = Pattern.compile("Email:\\s*(\\S+)");
    Matcher matcher = pattern.matcher(str);
    if (matcher.find()) { System.out.println(matcher.group(1)); }
        
		str = "Larry;Sam:Jack-Benny";
		String[] words = str.split("[;:-]"); // multiple delimiters
		for (String word : words) { System.out.println(word); }
		
    // split string into stream

    Stream<String> stream = Arrays.stream(words);
    stream.forEach(System.out::println);
        
    List<String> names = Stream.of(words)
        		.toList();
    for (String name : names) {
      System.out.print(name + " ");
    }
        
    stream = Pattern.compile("[;:-]").splitAsStream(str);
    stream.forEach(System.out::println);
        
    // flatMap transforms each element of a stream into zero or more elements, potentially changing the size of the stream
    // used for 1-to-many transformations and flattening nested structures
    stream = Stream.of("a,b", "c,d,e", "f", "g,h,i,j")
        	    .flatMap(Pattern.compile(",")::splitAsStream);
    stream.forEach(System.out::println); // prints all the letters individually on each line
  }
}
