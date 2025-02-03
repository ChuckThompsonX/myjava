package myjava.streams;

import java.util.Arrays;
import java.util.List;

public class StreamVsLoop {

	public static void main(String[] args) {
		
		/*
		Streams are ideal for functional or smaller lines of code, for something more specific.
		And for larger data sets they can be more efficient, for smaller data sets the opposite though.
		Streams can be easily parallelized to improve performance on multi-core systems (replace .stream() with .parallelStream()).
		Streams can be harder to debug though.
		 */
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// find sum of even numbers using a loop
		int sum = 0;
		for (int number : numbers) {
		    if (number % 2 == 0) {
		        sum += number;
		    }
		}
		System.out.println(sum);
		
		// stream performs same operations in a more declarative way:
		// - filter keeps only the even numbers
		// - mapToInt converts the stream of Integer objects to a stream of primitive int values
		// - sum adds up the int values
		sum = numbers.stream()
			.filter(number -> number % 2 == 0)
		        .mapToInt(Integer::intValue)
		        .sum();
		System.out.println(sum);
	}
}
