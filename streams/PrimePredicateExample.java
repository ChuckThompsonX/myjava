package myjava.streams;

import java.util.function.Predicate;
import java.util.stream.LongStream;

public class PrimePredicateExample {

    public static void main(String... args) {
    	
        Predicate<Integer> isPrime = (n) -> {
            if (n <= 1) {
                return false;
            }
            return LongStream.rangeClosed(2, (long) Math.sqrt(n))
    				.allMatch(i -> n % i != 0); // .noneMatch(i -> n % i == 0);
        };

        boolean isNumPrime = isPrime.test(7);
        System.out.println(isNumPrime);
        isNumPrime = isPrime.test(9);
        System.out.println(isNumPrime);
    }
}
