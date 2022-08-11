package JavaBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int sum=0;
		
	
		System.out.println("enter database member  size=");
		Scanner sc= new Scanner(System.in);
		
		int b=sc.nextInt();
		
		int Array[]=new int[b];
		
		
		
		
		for(int i=0;i<Array.length;i++) {
			
		    
			System.out.println("enter value of "+i);
			
			
			Array[i]=sc.nextInt();
			
	
		}
		
		
		System.out.println("your values are=");
		
		for(int j=0;j<Array.length;j++)
			
		{
			sum=sum+Array[j];
			System.out.print(" "+Array[j]);


	}
		
		System.out.println(" ");
		System.out.println("total members are ="+Array.length);
		System.out.println("sum="+sum);
	    System.out.println("Average="+sum/Array.length);
	    
	    
	    
	 
	    
	   
	
	}
	
	
	
	
	
	

	
	
	

}
