package JavaBasic;

public class ArrayJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int a[]= {2,5,1,3,8,9,5};
		
		
		

		
		int temp=0;
		
		
		
		System.out.println("sorted array is ");
		
		
		for(int i=0;i<=a.length-1;i++)
			
		{
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
					
				}
				
			}
			
			System.out.println(a[i]);
			
			
		}
		
		

		
		
		
	}
}
