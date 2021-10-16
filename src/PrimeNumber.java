import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is prime or not ");
		
		int numb = sc.nextInt();
		
		boolean flag = isPrime2(numb);
		if(flag) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

	private static boolean isPrime(int numb) {
		int n = (int) Math.sqrt(numb);
		
		for(int i =2; i<=n; i++) {
			if(numb % i == 0) {
			   return false;
			}
		}
		
		return true;
	}
	
	
	// Second way to find prime number 
	private static boolean isPrime2(int numb) {
		
		if(numb == 2 || numb == 3) {
			return true;
		}
		
		if(numb % 2 == 0) {
			return false;
		}
		
		int n = (int) Math.sqrt(numb);
		
		for(int i =3; i<=n; i++) {
			if(numb % i == 0) {
			   return false;
			}
		}
		
		return true;
	}


}



// 2 3 5 7 11 13 17