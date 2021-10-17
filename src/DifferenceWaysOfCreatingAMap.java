import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferenceWaysOfCreatingAMap {

	public static Map<String, String> map;

	static {

		map = new HashMap<>();
		map.put("Rohit", "Sharma");

	}

	public static void main(String[] args) {

		// 1. Using HashMap class
		Map<String, String> map = new HashMap<>();

		System.out.println("=================Static way : Static HashMapy====================================");
		// 2. Static way : Static HashMap
		System.out.println(DifferenceWaysOfCreatingAMap.map.get("Rohit"));

		System.out.println(
				"=================Immutable map with only one single entry====================================");
		// 3. Immutable map with only one single entry
		Map<Integer, String> singletonMap = Collections.singletonMap(100, "Rohit");
		System.out.println(singletonMap);
		// singletonMap.put(200, "Mohit"); // when we are trying to add in a singleton
		// map this will give java.lang.UnsupportedOperationException

		
		// 4. In JDK 8
		// We are creating 2D array and using Stream.of
		System.out.println("=================Using JDK 8====================================");
		Map<String, String> map1 = Stream.of(new String[][] { { "Rohit", "Sharma" }, { "Suman", "Aggrawal" }, })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map1.get("Rohit"));
		map1.put("Lisa", "ray");
		System.out.println(map1);

		// Converting and Array of integer into list of integer
		List<Integer> l1 = Stream.of(new Integer[] { 1, 4, 6, 3, 8, 5 }).collect(Collectors.toList());
		System.out.println(l1);

		// 5. Using Simple Entry map
		System.out.println("=================using Simple Entry map ====================================");
		Map<String, String> usingEmtryMap = Stream.of(

				new AbstractMap.SimpleEntry<>("Vivek", "Kumar"), 
				new AbstractMap.SimpleEntry<>("Himanshu", "Kumar")
				)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(usingEmtryMap.get("Vivek"));

		
		// From JDK 1.9
		// Creating Empty Map JDk 1.9, And If you will try to insert value it will give
		// java.lang.UnsupportedOperationException
		Map<Object, Object> emptyMap = Map.of();
		// emptyMap.put(100, "Rohit"); // this will give
		// java.lang.UnsupportedOperationException

		// 6. By using Map.of also we can create Singleton Map, This is JDK 1.9 feature
		Map<Object, Object> singletonMap2 = Map.of("K", "V");
		System.out.println(singletonMap2.get("K"));
		//singletonMap2.put("A", "B"); // but if we try to put any element after the first entry we will get
										// java.lang.UnsupportedOperationException
		
		// Multiple values Map, max 10 pair can be stores
		Map<String, String> multiMap = Map.of("k1", "v1","k2","v2","k3","v3","k4","v4");
		System.out.println(multiMap.get("k1"));
		System.out.println(multiMap.get("k2"));
	}

}
