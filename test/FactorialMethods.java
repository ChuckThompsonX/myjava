package myjava.test;

public class FactorialMethods {

	static int fact(int n) {
		if (n == 1) return 1;
		return fact(n - 1) * n;
	}
	
	interface Fact {
		int func(int n);
	}
	
	public static void main(String... args) {
		
		Fact f = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result = i * result;
			}
			return result;
		};

		int factorial = f.func(5);
		System.out.println(factorial);
		
		factorial = fact(5);
		System.out.println(factorial);
	}
}
