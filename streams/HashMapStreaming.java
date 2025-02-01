package myjava.streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HashMapStreaming {

	public static void main(String... args) {

		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(11, "Charlie");
		hmap.put(4,  "Zulu");
		hmap.put(77, "Yankee");
		hmap.put(5,  "Alpha");
		hmap.put(9,  "Papa");
		hmap.put(66, "Quebec");
		hmap.put(0,  "Romeo");

		// sort by keys in ascending order
		Map<Integer, String> sortedByKey = hmap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Sorted (asc) by keys: " + sortedByKey);

		// sort by values in descending order
		Map<Integer, String> sortedByValue = hmap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Sorted (desc) by values: " + sortedByValue);

		// filter entries where the value is greater than 30
		Map<Integer, String> filteredMap = hmap.entrySet().stream()
		    .filter(entry -> entry.getKey() > 30)
		    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println("Keys > 30: " + filteredMap);
		
		// find the entry with any value of "Alpha"
		Optional<Map.Entry<Integer, String>> entry = hmap.entrySet().stream()
		    .filter(e -> e.getValue().equals("Alpha"))
		    .findFirst();
		
		System.out.println("Find filter: " + entry);
	
		// concatenate all the values
		String all = hmap.values().stream().reduce("", String::concat);
		System.out.println("Concatenate all values: " + all);
	}
}

