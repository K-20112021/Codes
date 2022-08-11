package JavaBasic;

public class Parent {
	
	
	int a;
	
	int b;
	
	//defualt
	 Parent() {
		
		
		System.out.println("defualt constrctor");
	}
	
	 //parameter comstrtuor
	 Parent(int a,int b){
		 
		this();
		 this.a=a;
		 this.b=b;
		 
		 System.out.println("two  para constrtuor");
		 
		 System.out.println(a);
		 System.out.println(b);
		 
		 
	 }
	 
	 //2 para
	 
	 Parent(int a ,int b,int c){
		 
	
		 
		// this(a,b);
		 
		 
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(b);
		 
		 System.out.println("two  para constrtuor");
	 }
	
	

}
