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
		for(int i = str.length()-1; i>= 0; i--) {
			reverse = reverse +str.charAt(i);
		}
		
		
		return reverse;
		
	}

	// Here We will use 2 methods of String length() and charAt()
	
	
}
