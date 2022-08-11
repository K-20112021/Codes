package ArrayPrograms;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,2,3,4,5,5,6,7,8};
		int count=0;
		
		int l=a.length;
		
		for(int i=0;i<l;i++) {
			
			for(int j=i+1;j<l;j++) {
				
				if(a[i]==a[j]) {
					
					
					System.out.println(a[j]);
					
					count++;
					
				}
				
				
				
				
			}
			
		}

	}

}
