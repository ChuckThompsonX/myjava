package myjava.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterTakeWhile {

    public static void main(String... args) {
      
        List<Integer> numbers = List.of(2, 4, 6, 1, 8, 10);

        // using filter
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Filtered numbers: " + filteredNumbers); // Output: [2, 4, 6, 8, 10]

        // using takeWhile
        // includes elements as long as the predicate is true
        // stops immediately when it encounters an element for which the predicate is false
        List<Integer> takeWhileNumbers = numbers.stream()
                .takeWhile(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("takeWhile numbers: " + takeWhileNumbers); // Output: [2, 4, 6]
    }
}
