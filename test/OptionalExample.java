package myjava.test;

import java.util.Optional;

public class OptionalExample {

	// handle potentially null values in a better way avoiding risk of NPE

	public static void main(String... args) {

		Optional<String> name = Optional.ofNullable("John"); // null

		name.ifPresentOrElse(
			(value) -> { System.out.println("Value " + value); },
			() -> { System.out.println("Unknown"); }
		);

		// use map to transform value if present
		Optional<Integer> length = name.map(String::length);
		System.out.println("Is " + length.orElse(-1) + " chars long.");
	}
}
