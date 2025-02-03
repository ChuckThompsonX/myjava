package myjava.streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QuickNumberStream {

	// here are some ways to create a quick list of numbers
	
	public static void main(String[] args) {
		
		// infinite stream, numbers doubled each iteration
		// skip the first 5, limit total of 10
		List<Integer> numbers = Stream.iterate(2, i -> i * 2)
				.skip(5)
				.limit(10)
				.toList();
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		// integer range from 1 to 100, skip the first 3
		// filter to just even numbers, where each of those numbers is doubled
		int[] evenNumbers = IntStream.range(1, 100)
				.skip(3)
				.filter(n -> n % 2 == 0)
				.map(n -> n * 2)
				.toArray();
		
		for (int i : evenNumbers) {
			System.out.println(i);
		}
	}
}
