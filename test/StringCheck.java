package myjava.test;

public class StringCheck {

	public static void main(String[] args) {
		String n = null;
        
		// "".equals(n) is just a null safe check
		// i.e. if n is null it won't throw a NPE

		// This *only* tests if the string is blank
		// You ideally won't check for this 
		if ("".equals(n)) { // FALSE
		    // You will never get here if n is null
		    System.out.println("\"\".equals(n)");
		}

		// This is the more common check
		// It checks both String match and null
		if ("PROBFAIL".equals(n)) { // FALSE
		    // This is safe because it will never be true if n is null
		    System.out.println("\"PROBFAIL\".equals(n)");    
		}

		// Here's where you have to be CAREFUL!
		if (!"".equals(n)) { // TRUE
		    // You will get here BUT n will still be null
		    System.out.println("!\"\".equals(n)");
		    // This next line will throw a NPE
		    n = n.toLowerCase();
		    System.out.println(n);
		}
	}
}
