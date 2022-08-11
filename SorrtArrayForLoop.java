package ArrayPrograms;

public class SorrtArrayForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int [] a= {2,1,4,5,6,17,13,12,11};
	
	int temp=0;
	
	//sort array using for Loop Assending order  low to higher
	
	
	System.out.println("Sorted array using For Loop= Asending order");
	
	for (int i=0;i<a.length;i++)
	{
		
		for (int j=i+1;j<a.length;j++)
		{
			
			if( a[i]>a[j]) {
				
			
			temp= a[i];//2
			a[i]=a[j]; //I=1
			a[j]=temp;//J=2
			
			}
	
		}
		System.out.print(" "+a[i]);
		
	}
	
	
	System.out.println("  3rd lowest number="+a[2]);
	
	
	//System.out.println("Sorted array using For Loop= Descending order");
	System.out.println();
	
	System.out.println("Sorted array using For Loop= Descsending order");
	
	for (int i=0;i<a.length;i++)
	{
		
		for (int j=i+1;j<a.length;j++)
		{
			
			if( a[i]<a[j]) {
				
			
			temp= a[i];
			a[i]=a[j];
			a[j]=temp;
			
			}
	
		}
		System.out.print(" "+a[i]);
		
	}
	
	System.out.println("  3rd highest  number="+a[2]);

	}

}
