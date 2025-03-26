package myjava.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapifyFileData {

	public static void main(String[] args) throws IOException {
		
		// read comma delimited data rows from file
		Stream<String> lines = Files.lines(Paths.get("employees.txt"));
		
		Map<Integer, String> map = lines
				.map(element -> element.split(",")) // split each element in line via comma
				.filter(element -> element.length == 2) // number of elements in each line has to equal 2 
				.filter(element -> Integer.parseInt(element[0]) > 40) // first element has to be greater than 0
				.collect(Collectors.toMap(element -> Integer.parseInt(element[0]), element -> element[1])); // key value
		
		// close resource
		lines.close();
		
		for (Integer key : map.keySet()) { System.out.println(key + " " + map.get(key));}
		
		// order map
		map = map.entrySet().stream()
                		.sorted(Map.Entry.comparingByKey()) // order by key
                		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        		(e1, e2) -> e1, LinkedHashMap::new)); // can use TreeMap here w/o sorted op
		
		map.forEach((k,v) -> {System.out.println(k + " " + v);});
	}
}

/*
Sample employees.txt file:

37,John Doe
42,Suzy Queue
55,Jack Sparrow
59,Pock Jock
64,Cam Jam
77,Shady Brady
88,Vote Pedro
 */ 
