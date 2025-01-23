package myjava.generics.genericinterface;

public class TestMinMax {

	public static void main(String[] args) {
		
		Integer iNums[] = {3, 6, 2, 8, 6};
		
		MinMaxFinder<Integer> mnf = new MinMaxFinder<>(iNums);
		
		System.out.println(mnf.max());
		System.out.println(mnf.min());
	}
}
