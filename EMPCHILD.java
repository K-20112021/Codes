package JavaBasic;

public class EMPCHILD extends Emp {
	
	int mobileno;
	
	EMPCHILD(int Id,int sal,String name,String Add, int mobileno){
		
		super(Id, sal);

		this.mobileno=mobileno;
		
		System.out.println(Id);
		System.out.println(sal);
		
		System.out.println(mobileno);
		
		
		
		
	}
	

}
