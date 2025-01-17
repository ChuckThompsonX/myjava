package myjava.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {

	public static void main(String... args) {
		
		//**** Popular for method parameters ****//
		// http://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html
		// List of unknown type
		
		// Consider the following method...

		/*
		public static void printList(List<Object> list) {
		    for (Object elem : list)
		        System.out.println(elem + " ");
		    System.out.println();
		}
		 */
		
		// The goal of printList is to print a list of any type, but it fails to achieve that goal. 
		// It prints only a list of Object instances; it cannot print List<Integer>, 
		//List<String>, List<Double>, and so on, because they are not sub-types of List<Object>.		 

		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String> ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ls);		
	}

	// Any concrete type A, List<A> is a sub-type of List<?>, you can use printList to print a list of any type
	public static void printList(List<?> list) {
	    for (Object elem : list) {
	        System.out.print(elem + " ");
		}
	    
	    System.out.println();
	}
}
