package myjava.functions;

import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionExample {

	public static void main(String... args) {
		
		// function interface defined as Function<T, R>
		// T - type of the input to the function
		// R - type of the result
		// has a single abstract method R apply(T t);
		
		// takes string input and returns its lower case version as output
		Function<String, String> toLower = str -> str.toLowerCase();
		System.out.println(toLower.apply("HELLO")); 

		// convert string to its length
	    	Function<String, Integer> stringLengthFunction = String::length;
	    	System.out.println(stringLengthFunction.apply("Hello World!"));
	
	    	// function to double an integer
	    	Function<Integer, Integer> doubleFunction = x -> x * 2;
	    	System.out.println(doubleFunction.apply(5));
	    
        	// using andThen
	    	Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        	Function<Integer, Integer> add3 = x -> x + 3;
        	Function<Integer, Integer> multiplyBy2AndAdd3 = multiplyBy2.andThen(add3);
        	System.out.println(multiplyBy2AndAdd3.apply(5));

        	// using compose
        	// first applies the before function [add3] to its input, and then applies this function [multiplyBy2] to the result
        	Function<Integer, Integer> add3AndMultiplyBy2 = multiplyBy2.compose(add3);
        	System.out.println(add3AndMultiplyBy2.apply(5));

        	// using identity
        	Function<String, String> identityFunction = Function.identity();
        	System.out.println(identityFunction.apply("Hello"));
        
        	// Primitive Type Specializations IntFunction, LongFunction, and DoubleFunction
        	IntFunction<String> intToString = x -> "Number: " + x;
        	System.out.println(intToString.apply(10));
	}
}
