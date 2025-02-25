package test;

import java.util.function.Function;

public class MethodReferences {

	interface StringFunc {
		String func(String n);
	}

	interface MyFunc<T> {
		T func(T[] vals, T v);
	}

	static class MyStrStaticOp {
		static String strRev(String s) {
			return new StringBuilder(s).reverse().toString();
		}
	}

	static class MyArrOps {
		static <T> int countMatch(T[] vals, T v) {
			int countMatch = 0;
			for (T m : vals) {
				if (m == v) {
					countMatch++;
				}
			}
			return countMatch;
		}
	}

	public static void main(String[] args) {

		// Passing in a method implementation
		// 1. Implemented method
		// 2. Interface
		// 3. Destination method
		
		class MyStrOp { String strCap(String s) { return s.toUpperCase(); } }
		MyStrOp strOps = new MyStrOp();
		Integer[] vals = { 4, 7, 3 };

		// static method reference
		String s1 = stringOp(MyStrStaticOp::strRev, "hello");

		// FunctionExample expression argument
		String s2 = stringOp((str) -> { return str.toLowerCase(); }, "STRING");

		// method reference
		String s3 = stringOp(strOps::strCap, "hello");

		// method reference using built-in FI
		String s4 = stringOpPredefined(strOps::strCap, "test");

		// generic static method reference
		int match = myOp(MyArrOps::<Integer>countMatch, vals, 7);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(match);
	}

	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	static String stringOpPredefined(Function<String, String> strFunc, String s) {
		return strFunc.apply(s);
	}

	static <T> T myOp(MyFunc<T> f, T[] vals, T v) {
		return f.func(vals, v);
	}
}
