package myjava.comparator;

import java.util.TreeSet;

public class CompDemo {
    
    public static void main(String[] args) {
        // create a tree set
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        
        // add elements to the tree set
        ts.add("C");ts.add("A");ts.add("B");
        ts.add("B");ts.add("E");ts.add("F");
        ts.add("D");
        
        // display the elements
        treeSet.stream()
            .forEach(System.out::println);
    }
}
