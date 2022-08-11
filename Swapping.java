package JavaBasic;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		System.out.println("a beore swap="+a);
		System.out.println("b beore swap="+b);
		
	
		System.out.println("*****************************************************************************");
		
		a=a+b;            // 30
		b=a-b;           //30-20=10
		a=a-b;           //30-10=20
		
		System.out.println("a after swap ="+a);
		System.out.println("b after swap="+b);

	}

}
