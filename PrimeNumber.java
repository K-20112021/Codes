package ArrayPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		
		int n=17;
		int m=n/2;
		int flag=0;
		
		if(n==0|| n==1) {
			
			
			System.out.println("no is not prime number");
		}
		
		else {
			
			for(int i=0; i<=m;i++) {
				
				if(n%2==0) {
					
					System.out.println("number is not prime number");
					flag=1;
					break;
				}
			}
			
		}
		
		if(flag==0) {
			System.out.println("number is prime");
		}
		
	}

}
