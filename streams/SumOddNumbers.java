package myjava.streams;

import java.util.Arrays;
import java.util.List;

public class SumOddNumbers {

	public static void main(String... args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		// sum of all odd numbers
		int sum = numbers.stream()
			.filter(x -> x % 2 != 0) // returns plain old stream of odd numbers
			.mapToInt(Integer::intValue) // you need an Int stream
			.sum(); // in order to do this sum
		
		System.out.println(sum);
	}
}
