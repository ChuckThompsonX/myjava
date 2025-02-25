package test;

import java.util.function.Function;

public class MethodReferencesSimple {

	public static void main(String[] args) {
		
		// 1. Implemented method (has to be compatible with FI)
		// 2. Destination method (has interface param)
		// 3. Destination method call (with method reference param ::)
		
		class MyStrOp {
			// implemented method
			String strCap(String s) { 
				return s.toUpperCase(); 
			} 

			// destination method using a predefined FI
			String stringOp(Function<String, String> sf, String s) {
				return sf.apply(s);
			}
		}
		
		MyStrOp strOps = new MyStrOp();
		
		// method reference param
		String s = strOps.stringOp(strOps::strCap, "hello");
		
		System.out.println(s);
	}
}
