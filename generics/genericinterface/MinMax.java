package myjava.generics.genericinterface;

/**
 * Collections has a max min.
 */
public interface MinMax <T extends Comparable<T>> {
	
	public T min();
	public T max();

}
