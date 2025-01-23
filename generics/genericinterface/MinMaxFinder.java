package myjava.generics.genericinterface;

public class MinMaxFinder <T extends Comparable<T>> implements MinMax<T> {

	T[] vals;
	
	public MinMaxFinder(T[] ob) {
		this.vals = ob;
	}

	public T max() {
		T max = vals[0];
		
		for (int i = 1; i < vals.length; i++) {
			if (vals[i].compareTo(max) > 0) {
				max = vals[i];
			}
		}
		
		return max;
	}
	
	public T min() {
		T min = vals[0];
		
		for (int i = 1; i < vals.length; i++) {
			if (vals[i].compareTo(min) < 0) {
				min = vals[i];
			}
		}
		
		return min;
	}
}
