import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CountTheCharacterOccurence {

	public static void main(String[] args) {
		
		String [] arr = {"Java", "Python", "C++", "Java", ".Net", "Java"};
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.nextLine();
		
		countCharaterOccurence(s);
		
		duplicateElementInAnArray(arr);

	}

	private static void duplicateElementInAnArray(String[] arr) {
		
		// 1st Method
		boolean flag = false;
		for(int i = 0; i< arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate element "+arr[i]);
					 flag = true;
				}
			}
		}
		if(flag == false) {
		    System.out.println("Duplicate Elements Not found ");
		}
		
		
		
		
	}

	private static void countCharaterOccurence(String s) {
		
		char [] c = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : c) {
			if(map.get(ch) != null) {
				map.put(ch, map.get(ch)+1);
			}
			else {
			map.put(ch, 1);
			}
			
		}
		
		System.out.println(map);
	     Iterator itr = map.keySet().iterator();
	     while(itr.hasNext()) {
	    	 if(map.get(itr.next())>1) {
	         Character ch = (Character) itr.next();
	    	 System.out.println(ch);
	    	 }
	    	 
	     }
		
	}

}
