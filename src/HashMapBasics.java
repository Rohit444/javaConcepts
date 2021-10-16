import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		// no order - no indexing 
		// stored key-value pair
		// key can not be duplicate 
		// Can store n number of null values but only one null key 
		// hashmap is not thread safe - unsynchronized 
		
		HashMap<String, String> map = new HashMap<>();
         map.put("UK", "London");
         map.put("UK", "London11");
         map.put("India", "Delhi");
         map.put(null, "Burlin");
         map.put(null, "LA");
         //map.remove("India");
         
         System.out.println(map.get(null)); // always give latest value of null key 
         System.out.println("=======================Iterator over the key : by using key Set==============================");
         // Iterator over the key : by using key Set
         Iterator itr = map.keySet().iterator();
         while(itr.hasNext()){
        	 String key = (String) itr.next();
        	 String value = map.get(key);
        	 System.out.println("Key is "+key+" value is "+value);
         }
         System.out.println("================Iterator over the set(pair) by using entry set=====================================");
         
         // Iterator over the set(pair) by using entry set
         Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
         while(iterator.hasNext()) {
        	 Entry<String, String> entry = iterator.next();
        	 System.out.println(entry);
        	 System.out.println("Key "+entry.getKey()+" "+" Value is "+entry.getValue());
         }
         
         System.out.println("====================Using java 8 for each method=================================");
         // Using java 8 for each method
         map.forEach((k,v)-> System.out.println("Key "+k+" "+"Value "+v));
         
         
	}

}
