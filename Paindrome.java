package JavaBasic;

public class Paindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Aba";
		String b="";
		
		int n=a.length();
		
		for(int i=n-1;i>=0;i--) {
			
			b=b+a.charAt(i);// b=aba
			
		}
		
		if(a.equalsIgnoreCase(b)) {
			
			
		System.out.println("it is palindrome");
			
			
		}else {
			
			System.out.println("It is  not palindrome");
		}
		
	}

}
