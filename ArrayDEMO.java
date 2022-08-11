package ArrayPrograms;

public class ArrayDEMO {
	
	
	public static void main(String[] args) {
		
		
		int A[]= {1,4,2,20,10,2,13,50};
		int L=A.length;
		
		int temp;
		
		for(int i=0;i<L;i++) {
			
			for(int j=i+1;j<L;j++) {
				
				if(A[i]>=A[j]) {
				
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
					
				}
				
				
			}
			
			System.out.println(A[i]);
		}
		
		
	}

}
