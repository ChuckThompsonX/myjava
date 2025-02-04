package myjava.functions;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		// function that takes a string as input and returns its lower case version as output
		Function<String, String> toLower = str -> str.toLowerCase();

		// apply function to input string and returns result
		String result = toLower.apply("HELLO");

		System.out.println(result); 
	}

}
