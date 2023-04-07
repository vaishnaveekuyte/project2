package TestPackage3;

public class constructor2 { // user define constructor with and without parameter


	
	 
	int a;
	int b;
	int m;
	String Name;
	String Velocity;
	 
	constructor2(){ // UD constructor without parameter
	 
	 a=78;
	 b=68;
	 
	}

	constructor2(int c, int d,int i){ // UD constructor with parameter
	 
	 a=c;
	 b=d;
	 m=i;
	}

	constructor2 (int c,int d){    // UD constructor with parameter
	 
	 a=c;
	 b=d;
	 
	}
	constructor2(String abc, String Testing){
	 Name= abc;
	 Velocity= Testing;
	 
	 
	}

	public void addition() {   // non static method 
	 System.out.println(m+a+b);
	 int xyz;
	 xyz=89;
	 
	}

	public void test() {
	 System.out.println(Name);
	 System.out.println(Velocity);
	}


	public static void main(String[] args) {
	 
		constructor2 x = new constructor2();
	 x.test();
	 x.addition();
	 x.addition();
	 
	 constructor2 y = new constructor2(56,68);
	 y.addition();
	 
	 constructor2 z = new constructor2(10,20,30);
	 z.addition();
	 
	 constructor2 e = new constructor2("PNG","Automation");
	 e.test();
	}
	 
	 
	 

	}


