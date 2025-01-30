package myjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringParsing {

	public static void main(String[] args) {
		
		// regular expressions for complex pattern matching
        	String str = "Email: joe.doe@example.com";
        	Pattern pattern = Pattern.compile("Email:\\s*(\\S+)");
        	Matcher matcher = pattern.matcher(str);
        	if (matcher.find()) { System.out.println(matcher.group(1)); } // output: joe.doe@example.com
        
        	// split string into stream
		str = "Larry;Sam:Jack-Benny";
		List<String> names = Arrays.stream(str.split("[;:-]")) // multiple delimiters
				.toList();
		System.out.println(names); // output: [Larry, Sam, Jack, Benny]

        	// flatMap transforms each element of a stream into zero or more elements, potentially changing the size of the stream
        	// used for 1-to-many transformations and flattening nested structures
        	List<String> letters = Stream.of("a,b", "c,d,e", "f", "g,h,i,j")
				.flatMap(Pattern.compile(",")::splitAsStream)
				.toList();
        	System.out.println(letters); // output: [a, b, c, d, e, f, g, h, i, j]
	
		// filtering words based on length and transforming to upper case
		str = "This is a sample sentence.";
		List<String> words = Arrays.stream(str.split(" "))
				.filter(w -> w.length() > 3)
				.map(String::toUpperCase)
				.toList();
		System.out.println(words); // output: [THIS, SAMPLE, SENTENCE.]

		// joining words into a single string
		String joinedString = Arrays.stream(str.split(" "))
				.collect(Collectors.joining("-"));
		System.out.println(joinedString); // output: This-is-a-sample-sentence.

		// counting word occurrences and populating map
		Map<String, Long> wordCounts = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordCounts); // output: {a=1, This=1, is=1, sentence.=1, sample=1}

		// extracting key-value pairs and populating map
		str = "key1=value1, key2=value2, key3=value3";
		Map<String, String> kvPairs = Arrays.stream(str.split(", "))
				.map(pair -> pair.split("="))
				.filter(pair -> pair.length == 2)
				.collect(Collectors.toMap(pair -> pair[0], pair -> pair[1]));
		System.out.println(kvPairs); // output: {key1=value1, key2=value2, key3=value3}
	}
}
