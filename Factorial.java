package JavaBasic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("factorial projetc");
		System.out.print("Enter number=");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int fact=1;
		
		for(int i=n;i>=1;i--) {
			
		fact=fact*i;	
			
		}
		
		System.out.println("factorail="+fact);
		
	
		

	}

}
