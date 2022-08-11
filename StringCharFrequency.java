package String;

public class StringCharFrequency {

	public static void main(String[] args) {
		
		String str="abbac";
		
		
		
		for(char ch='a';ch<='z';ch++) {
			int  count = 0;
			for(int i=0;i<str.length();i++) {
				
				 
				if(str.charAt(i)==ch) {
					
				  count++;
				  
				  System.out.println(count);
				  
				}
				
				
				
				
				
				
			}
			
		
		}

	}

}
