package myjava.streams;

import java.util.Arrays;
import java.util.List;

public class FindThirdLargestInteger {

	public static void main(String... args) {
		
		// find the third largest integer
		
		List<Integer> numbers = Arrays.asList(73,12,26,26,48,52,18,34,96,53,88);
		
		Integer n = numbers.stream()
			      .distinct() // remove any dups
			      .sorted((a, b) -> Integer.compare(b, a)) // reverse compare
			      .skip(2) // skip first 2 largest values
			      .findFirst() // then find first one left
			      .orElse(null); // don't give any value if can't find first
		
		System.out.println(n);
	}
}
