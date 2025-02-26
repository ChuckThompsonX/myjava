package test;

import java.util.ArrayList;
import java.util.List;

public class MinDistance {

	/*
	 * This program finds the minimum distance between values.
	 */
	
	record DistancePair(int d, int p1, int p2) {}
	
	public static void main(String... args) throws Exception {
		
		List<Integer> vals = List.of(4,7,-8,2,17,-3,9,13,28,0,22);
		
		// validate values size first
		int size = vals.size();
		if (size < 2) {
			throw new Exception("Not enough values to compare.");
		}
		
		// restructure values into list of sorted records
		List<DistancePair> pairs = restructureValues(vals, size);

		// find the minimum distance value
		int minDist = retrieveMinimumDistance(pairs);
		
		// find the records that have minimum distance
		System.out.println("MIN DIST: " + minDist);
		for (var distPair : pairs) {
			if (distPair.d == minDist) {
				System.out.println("BETWEEN: " + distPair.p1 + " and " + distPair.p2);
			}
		}
	}
	
	/**
	 * The purpose of this method is the restructure the raw list of values into records
	 * more appropriate to work with.
	 * @param vals
	 * @param size
	 * @return
	 */
	private static List<DistancePair> restructureValues(List<Integer> vals, int size) {
		// sort values to make finding differences easier
		vals = vals.stream().sorted().toList();

		// declare variables outside of loop for performance reasons
		// just in case this list has 1000's of values
		// we don't want to keep declaring in each loop iteration
		int v1, v2;
		DistancePair dp = null;
		List<DistancePair> pairs = new ArrayList<>();
		
		// start at the top of the array and work down
		for (int i = size - 1; i > 0; i--) {
			v1 = vals.get(i);
			v2 = vals.get(i - 1);
			dp = new DistancePair(v1 - v2, v1, v2);
			pairs.add(dp);
		}
		
		return pairs;
	}
	
	/**
	 * This takes a list of DistancePair records and finds the minimum distance value.
	 * @param pairs
	 * @return
	 */
	private static int retrieveMinimumDistance(List<DistancePair> pairs) {
		// start with first value
		int minDist = pairs.get(0).d;
		
		for (var distPair : pairs) {
			if (minDist > distPair.d) {
				// found a smaller distance value
				minDist = distPair.d;
			}
		}
		
		return minDist;
	}
}
