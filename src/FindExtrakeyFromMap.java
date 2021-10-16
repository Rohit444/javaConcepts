import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindExtrakeyFromMap {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "A");
		m1.put(2, "B");
		m1.put(3, "C");
		
		Map<Integer, String> m2 = new HashMap<>();
		m2.put(1, "A");
		m2.put(2, "B");
		m2.put(3, "C");
		//m2.put(4, "D");
		
		
		// Compare by key-value
		System.out.println(m1.equals(m2));
		
		//compare by same keys : keySet()
		System.out.println(m1.keySet().equals(m2.keySet()));
		
		// Finding the Extra key in the hash map
		// Combining the key from both maps and then removing the keys of first map
		Set<Integer> combinedKeySet= new HashSet<>(m1.keySet());
		combinedKeySet.addAll(m2.keySet());
		
		System.out.println(combinedKeySet.size());
		
		combinedKeySet.removeAll(m1.keySet());
		System.out.println("Extra key we have is "+combinedKeySet);
		
		
		System.out.println("====================================");
		
		// Compare map by values 
		Map<Integer, String> m3 = new HashMap<>();
		m3.put(1, "A");
		m3.put(2, "B");
		m3.put(3, "C");
		
		Map<Integer, String> m4 = new HashMap<>();
		m4.put(4, "A");
		m4.put(5, "B");
		m4.put(6, "C");
		
		Map<Integer, String> m5 = new HashMap<>();
		m5.put(1, "A");
		m5.put(2, "B");
		m5.put(3, "C");
		m5.put(4, "C");
		
		System.out.println("============Duplicates are not allowed : using ArrayList========================");
		// Duplicates are not allowed : using ArrayList
		System.out.println(new ArrayList<>(m3.values()).equals(new ArrayList<>(m4.values())));
		System.out.println(new ArrayList<>(m3.values()).equals(new ArrayList<>(m5.values())));
		
		System.out.println("============Duplicates are allowed : using HashSet========================");
		// Duplicates are allowed : using HashSet
		System.out.println(new HashSet<>(m3.values()).equals(new HashSet<>(m4.values())));
		System.out.println(new HashSet<>(m3.values()).equals(new HashSet<>(m5.values())));
		

	}

}
