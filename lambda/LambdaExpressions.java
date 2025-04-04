package myjava.lambda;

import static java.lang.System.out;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;

public class LambdaExpressions {

	public static void main(String[] args) {

		// ----------------------------------------
		// Factorial
		// ----------------------------------------
		
		IntFunction<Integer> iCompute = (value) -> {
			int factorial = 1;
			for (int idx = 1; idx <= value; idx++) {
				factorial = idx * factorial;
			}
			return factorial;
		};
		
		handleCompute(iCompute, 7);

		// ----------------------------------------
		// Natural log
		// ----------------------------------------
		
		DoubleFunction<Double> dCompute = (value) -> {
			double log = Math.log(value);
			return log;
		};

		handleCompute(dCompute, 9.446);
		
		// ----------------------------------------
		// Square
		// ----------------------------------------
		
		dCompute = (value) -> {
			double square = Math.pow(value, 2);
			return square;
		};

		handleCompute(dCompute, 3.712);

		// ----------------------------------------
		// Tangent
		// ----------------------------------------
		
		dCompute = (value) -> {
			double tangent = Math.tan(value);
			return tangent;
		};

		handleCompute(dCompute, 3.903);
	}

	public static void handleCompute(IntFunction<Integer> iC, int v) {
		// invoke the functional interface's method
		double result = iC.apply(v);
		out.println(result);
	}
	
	public static void handleCompute(DoubleFunction<Double> iC, double v) {
		// invoke the functional interface's method
		double result = iC.apply(v);
		out.println(result);
	}
}
