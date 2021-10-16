
public class ReverseString {

	public static void main(String[] args) {
		
		String s1 = "Rohit Sharma";
		
		String[] strArray = s1.split(" ");
		
		for(String tempStr : strArray) {
			System.out.println(tempStr);
		}
		
		for(int i=0 ; i<2;i++) {
			char [] charString = strArray[i].toCharArray();
			for(int j= charString.length-1; j>=0;j-- ) {
				System.out.println(charString[j]);
			}
			System.out.println(" ");
		}
		
		

	}

}
