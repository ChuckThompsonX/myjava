package myjava.generics;

public class GenericMethod {

	public static void main(String[] args) {

		String val = "Hello";
		String[] answers = new String[] {"Test", "One", "Hello", "Two", "Three"};
		
		boolean isInArray = isIn(val, answers);
		System.out.println(isInArray);
	}
	
	// generic method takes a generic object T and V that extends T
	public static <T, V extends T> boolean isIn(T t, V[] v) {
		for (int i = 0; i < v.length; i++) {
			// spin thru array structure
			// generic types may need to override the equals method
			if (t.equals(v[i])) {
				return true;
			}
		}
		return false;
	}
}
