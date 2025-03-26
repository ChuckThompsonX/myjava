package myjava.streams;

import java.util.Arrays;
import java.util.List;

public class AverageIntegers {

	public static void main(String[] args) {
		
		// average of a list of integers
		List<Integer> intList = Arrays.asList(33, 26, 78, 49, 2, 93);
		
		double ave = intList.stream()
			.mapToDouble(Integer::doubleValue) // note the use of mapToDouble and Integer
			.average() // only works on doubles
			.orElse(0.0); // w/o it have to use OptionalDouble
		
		System.out.println(ave);
	}
}
