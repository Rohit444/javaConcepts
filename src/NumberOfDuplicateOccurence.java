import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class NumberOfDuplicateOccurence {

	// This Program will find out the number of duplicate occurrences of both word and character 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
        String str = sc.nextLine();
        
        //CheckDuplicateString(str);
        CheckDuplicateCharacter(str);
	}

	private static void CheckDuplicateCharacter(String str) {
	
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		Iterator itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Character tempString = (Character) itr.next();
			if(map.get(tempString)>1) {
			System.out.println(tempString);
			}
		}

	}

	private static void CheckDuplicateString(String str) {
		
		Map<String, Integer> map = new HashMap<>();
		String StringToCheck = str;
		String [] strArray = StringToCheck.split(" ");
		
		for(String st : strArray ) {
			if(map.get(st)!= null) {
				map.put(st, map.get(st) + 1);
			}
			else {
			map.put(st, 1);
			}
		}
		
		Iterator itr = map.keySet().iterator();
		while(itr.hasNext()) {
			String temp = (String) itr.next();
			if(map.get(temp) > 1) {
				System.out.println("The word "+temp+" appered "+map.get(temp)+" times");
			}
		}
		
	}

}
