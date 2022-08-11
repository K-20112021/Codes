package JavaBasic;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1="VIJAY";
		String S2="";
		
	int l=S1.length();
	
	
	for(int i=l-1;i>=0;i--) {
		
		S2=S2+S1.charAt(i);
		
		
	}
	
	
	System.out.println(S1);
	System.out.println(S2);
	
	
	if(S1.equalsIgnoreCase(S2)) {
		
		System.out.println("string is palindrome");
	}
	else
	{
		
		System.out.println("string is not palindrome");
	}
		
		
		
		

	}

}
