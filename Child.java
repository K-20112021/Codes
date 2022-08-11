package JavaBasic;

public class Child extends Father {
	
	int BankBal=1000;
	String name="kiran";
	
	
	
	
	void m2() {
		
		System.out.println("i am method of child");
		System.out.println(this.BankBal);
		System.out.println(this.name);
	}

}
