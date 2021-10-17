import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String which you want to reverse");
		String str = sc.nextLine();
		String reverse = reverse(str);
		System.out.println(reverse);
	}

	private static String reverse(String str) {
		
		String reverse = " ";
		
	// using length() and charAt() methods of String along with concatination operation (+)
//		for(int i = str.length()-1; i>= 0; i--) {
//			reverse = reverse +str.charAt(i);
//		}
//		
//		
//		return reverse;
		
		// Using Character Array
		char[] ch = str.toCharArray();
		int len = ch.length;
		for(int i = len-1; i>=0; i--) {
			reverse = reverse+ch[i];
		}
		return reverse;
		
		
		// Using String buffer class 
//		StringBuffer sb = new StringBuffer();
//		sb.append(str);
//		System.out.println(sb.reverse());
		
	}

	// Here We will use 2 methods of String length() and charAt()
	
	
}
