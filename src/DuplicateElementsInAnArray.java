import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInAnArray {

	public static void main(String[] args) {
		
		int [] arr = {7,7,7,5,5,2,4,4,3,5,6,8,8};
		
		//duplicateElementsInAnArrayUsingSet(arr);
		duplicateElementsInAnArrayUsingMap(arr);
		

	}

	

	// Finding the duplicate elemnets in an array using set
	private static void duplicateElementsInAnArrayUsingSet(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicateList =new ArrayList<>();
		for(int a : arr) {
			if(set.add(a) == false) {
				duplicateList.add(a);
			}
		}
		Collections.sort(duplicateList);
		System.out.println("Dulicate elements in the Array are "+duplicateList);
		
	}
	
	// Finding the duplicate elements in an array using map
	private static void duplicateElementsInAnArrayUsingMap(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> resultentList = new ArrayList<>();
		for(int a : arr) {
			if(map.get(a) != null) {
				map.put(a, map.get(a) + 1);
			}
			else {
			map.put(a, 1);
			}
		}
		Iterator itr = map.keySet().iterator();
		while(itr.hasNext()) {
			int element = (int)itr.next();
			if(map.get(element)> 1) {
			resultentList.add(element);
			}
			//System.out.println("Elements "+element+" Occured "+map.get(element)+" Times");
		}
		System.out.println("Repeted Elements are : "+resultentList);
	}

}
