import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to calculate factorial");
		int numb = sc.nextInt();
		findFactorial(numb);

	}

	private static void findFactorial(int numb) {
		
		// Accending Order for loop
		int factorial = 1;
		for(int i =1 ; i<= numb; i++) {
			factorial = factorial *i;
		}
		System.out.println("Factorial of Number is "+factorial);
	//=================================================================================	
		// Decending order for loop
		
//		int factorial = 1;
//		for(int i = numb; i>= 1 ; i--) {
//			factorial = factorial * i;
//		}
//		System.out.println("Factorial of Number is "+factorial);
	}

}

// !5 = 5*4*3*2*1
// !3 = 3*2*1
// !4 = 4*3*2*1