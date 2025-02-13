package myjava.streams;

import java.util.List;

public class TakeWhileExample {

	public static void main(String... args) {

		List<Integer> numbers = List.of(2, 4, 6, 7, 8, 10);

		// take elements while they are even
		List<Integer> evenNumbers = numbers.stream()
				.takeWhile(n -> n % 2 == 0)
				.toList();

		System.out.println(evenNumbers);
	}
}
