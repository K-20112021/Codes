package PalindromeNumber;

public class Palindrome1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int no=121;
		int actualNo=121;
		int rev=0;
		int rem;
		
		
		while(no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		
		System.out.println(rev);
		
		
		
		if(rev==actualNo) {
			
			System.out.println("no is palindrome");
			
		}
		else {
			
		System.out.println("palindrome");
		}
		
	

	}

}
