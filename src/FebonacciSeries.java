import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Print the number upto which you want to print Febonacci series");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		for(int i=1 ; i<= numb ; i++) {
			System.out.println(improvedFibo(i));
		}
		

	}
	
	// Using Memoization to improve fibonacci performance
	
	public static int improvedFibo(int number) {
		Map<Integer, Integer> cache = new HashMap<>();
		Integer fibonacci = cache.get(number);
		if (fibonacci != null) {
			return fibonacci; // fibonacci number from cache
		}
		
		// fibonacci number not in cache, calculating it
		fibonacci = fibonnachi2(number);
		
		// putting fibonacci number in cache for future request
		cache.put(number, fibonacci);
		return fibonacci;
	}
		
	
	//using Iteration
	public static int febonnacci(int numb) {
		
		int a = 1;
		int b = 1;
		int fibo = 1;
		
		if(numb ==1 || numb == 2) {
			return 1;
		}
		
	// Main logic
		for(int i =3 ; i<=numb; i++) {
		    fibo = a + b;
		    	a= b;
		    	b= fibo;
		    	
		}
		
		
		return fibo;
	}
	
	// Using recursion
	public static int fibonnachi2(int numb) {
		
		if(numb ==1 || numb == 2) {
			return 1;
		}
		
		// Main logic
		return fibonnachi2(numb-1) +  fibonnachi2(numb-2);
	}
	
	



}


// 1 1 2 3 5 8 13