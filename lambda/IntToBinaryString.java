package myjava.lambda;

import java.util.function.Function;

public class IntToBinaryString {

	public static void main(String[] args) {
		
		// generic functional interface provided by Java
		// 1st generic param is integer value passed into lambda function
		// 2nd generic param is the string result
		Function<Integer, String> func = num -> Integer.toBinaryString(num);
		String str = func.apply(10); // run the apply method on the functional interface
		System.out.println(str);
	}
}
