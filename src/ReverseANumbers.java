import java.util.Scanner;

public class ReverseANumbers {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number ");
       int numb = sc.nextInt();
       reverseIt(numb);
       
	}

	private static void reverseIt(int numb) {
//		int temp = numb;
//		int rev=0;
//		int rem=0;
//		
//		while(temp >0) {
//		rem = temp % 10;
//		rev = rev * 10 + rem;
//		temp = temp/ 10;
//		}
//		
//		System.out.println("Number after Reverse "+rev);
		
		// Using StringBuffer 
		
//		StringBuffer br = new StringBuffer(String.valueOf(numb));
//		StringBuffer rev = br.reverse();
//		System.out.println("Number after Reverse "+rev);
		
		// Using StringBuilder
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(numb);
		StringBuilder rev = sbl.reverse();
		System.out.println("Number after Reverse "+rev);
	}

}
