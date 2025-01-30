package myjava.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamUsage {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// sequential Stream
		System.out.println("Sequential Stream:");
		nums.stream()
				.forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));

		// parallel Stream
		System.out.println("\nParallel Stream:");
		nums.parallelStream()
				.forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));
	}
}

/*
Code is the same as the sequential stream but processing is divided among multiple threads.
The sequential stream uses only the main thread.
When to Use Parallel Streams:
-Large data sets
-Independent operations that don't rely on the order of processing
-CPU-bound tasks that are computationally intensive
 */
