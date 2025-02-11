package myjava.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReduceBoilerplateCode {

	public static void main(String... args) {
		
	        List<String> names = Arrays.asList("Doug", "Susan", "Larry");
	
		// won't work if you use List.of above
	        Collections.sort(names, new Comparator<>() {
	            @Override
	            public int compare(String n1, String n2) {
	                return n1.compareTo(n2);
	            }
	        });
	
	        System.out.println(names);
	        
	        // replaces the anonymous inner class above reducing lines of code
	        names.sort((n1, n2) -> n1.compareTo(n2));
	
	        System.out.println(names);
	}
}
