package JavaBasic;

public class Emp {
	
	int Id;
	int sal;
	String name;
	String Add;
	
	
	
	
	
	
	//default
	
	Emp() {
		
		
		System.out.println("defualt Constrctuor");
	}
	
	
	
	
	//single para
	Emp(int Id){
		
		this();
		this.Id=Id;
		
		System.out.println("defualt Constrctuor"+Id);

		
		
	}
	
	
	//double para
	
	Emp(int Id,int sal){
		
		  this(Id);
		 this.sal=sal;
		 
		 System.out.println("defualt Constrctuor+single"+Id+" "+sal+"");
	}
	
	//triple para
	
	Emp(int Id, int sal,String name){
		
		this(Id,sal);
		this.name=name;
		

		 System.out.println("defualt Constrctuor+single+double+triple");
		
	}
	
	
	//4th para
	
	
	Emp(int Id,int sal, String name,String Add){
		
		this(Id,sal,name);
		
		this.Add=Add;
		
		 System.out.println("defualt Constrctuor+single+double+triple+4th");
		
	}
		
	
	
	
	
	
	
	
	

}
