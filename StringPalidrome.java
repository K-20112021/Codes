package String;

public class StringPalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S="Kiran";
		String rev="";
		
		
		System.out.println("length of stirng ="+S.length());
		//*******************************************
		for(int i=S.length()-1;i>=0;i--) {
			
			
			rev=rev+S.charAt(i);
		}
		
		System.out.println("reverse ="+rev);
		
		//*******************************************
		
		if(S.equals(rev)) {
			
			System.out.println("palindrome");
		}else {
			System.out.println("not palidrome");
		}
		
		//*******************************************
		
		
	String Str[]=S.split("i");
	
	System.out.println(Str.length);
	System.out.println(Str[0]);
	System.out.println(Str[1]);
	

	}

}
