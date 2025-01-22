package myjava.recursion;

public class Factorial {

	public static void main(String... args) {
		int f = fact(5);
		System.out.println(f);
	}

	static int fact(int n) {
		if (n == 1) return 1;
		return fact(n - 1) * n;
	}
}
