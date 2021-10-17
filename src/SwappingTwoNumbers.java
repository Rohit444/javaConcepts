import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number ");
		int b = sc.nextInt();
		
		System.out.println("String Number before Swaping a= "+a+" b= "+b);
		
	//	SwapIt(a,b);
		
		SwapItWithoutUsingThirdVariable(a,b);

	}

	private static void SwapItWithoutUsingThirdVariable(int a, int b) {
		
		// 2. By using + & - operators
//		a = a+b;
//		b = a-b;
//		a = a-b;
		
		// 3. By using * & / operators. here a and b should not be zero
		
//		a = a*b;
//		b = a/b;
//		a = a/b;
		
		
		//4.  Using Single statement 
		
		b = a+b -(a=b);
		
		System.out.println("String Number after Swaping a= "+a+" b= "+b);
	}

	private static void SwapIt(int a, int b) {
		
		// 1. Using 3rd variable
		
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("String Number after Swaping a= "+a+" b= "+b);
		
		
	}
	
	

}
