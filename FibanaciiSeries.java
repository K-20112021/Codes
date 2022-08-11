package ArrayPrograms;

public class FibanaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 1 1 2 3  5----------
		
		int firstNo=0;
		int secondNo=1;
		
		int thirdNo;

		System.out.print(firstNo+" "+" "+ secondNo);
		
		System.out.print(" ");
		
		for(int i = 2;i<=10;i++) {
			
			thirdNo=firstNo+secondNo;
			

			System.out.print(" ");
			System.out.print(thirdNo);
			
			
			firstNo=secondNo;
			
			secondNo=thirdNo;
		}

	}

}
