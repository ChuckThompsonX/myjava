/**
 * Control or alter how elements are sorted (beyond natural ordering).
 * For example, reverse order.
 */
package myjava.comparator;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    
    @Override
    public int compare(String a, String b) {
        String aStr = a;
        String bStr = b;
        
        // reverse the comparison
        return bStr.compareTo(aStr); // return aStr.compareTo(bStr);
    }
    
    // Don't need to override equals
}
