package myjava.streams;

import java.util.stream.LongStream;

public class PrimeNumber {

	public static void main(String... args) {
		final long MAX = 20;
		for (long i = 2; i <= MAX; i++) {
			System.out.println(isPrime(i) ? (i + " is prime") : (i + " is not prime"));
		}
	}

	public static boolean isPrime(long number) {
		// range starts at 2 and goes up to the square root of number param
		// all elements have to match the no remainder lambda function
		return LongStream.rangeClosed(2, (long) Math.sqrt(number))
				.allMatch(n -> number % n != 0);
	}
}
