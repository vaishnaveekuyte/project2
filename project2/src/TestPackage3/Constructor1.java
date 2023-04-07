package TestPackage3;

public class Constructor1 {//UD Constructor with and without parameter
	
	int a;
	int b;
	int m;
	String name;
	String velocity;
	
	Constructor1(){// UD Constructor without parameter
		
	a=67;
	b=45;
	
		
	}
	
	Constructor1(int c,int d){// UD Constructor with parameter
		
		a=c;
		b=d;
	}
		
	Constructor1(int c,int d, int i){// UD Constructor with parameter
			a=c;
			b=d;
			m=i;
		}
		public void addition() {//non static method
			System.out.println(m+a+b);
			
			
		}
		public static void main(String[] args) {
			Constructor1 x=new Constructor1();
			x.addition();
			x.addition();
			
			Constructor1 y=new Constructor1(59,50);
			y.addition();
			
			Constructor1 z=new Constructor1(60,10,40);
			z.addition();
			
			
			
		}
	
}
