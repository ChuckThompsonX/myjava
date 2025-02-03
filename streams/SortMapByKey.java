package myjava.streams;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class SortMapByKey {

    public static void main(String[] args) {
    	
        Map<String, Integer> unsortedMap = Map.of("b", 2,"c", 3,"a", 1);

        Map<String, Integer> sortedMap = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMap);
    }
}
