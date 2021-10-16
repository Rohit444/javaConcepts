import java.util.Scanner;

public class PallindromNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is pallendrom or not ");
		int numb = sc.nextInt();
		 checkPallindrom(numb);
		

	}

	private static void  checkPallindrom(int numb) {
		
		int temp = numb;
		int rem = 0;
		int rev = 0;
		
		// Main logic
		while(temp != 0) {
		rem = temp % 10;
		rev = (rev * 10)+rem;
		temp =temp/10;
		}
		
		if(numb == rev) {
			System.out.println("Pallendrom");
		}
		else {
			System.out.println("Not a Pallendrom");
		}
		
	}
	
	

}
