package TestPackage3;

public class METHODWITHARG {
	
	public static void addition(int a, int b) {//static method with arg
		int c=a+b;
		System.out.println("addition:" +c);
	}
	public static void substration(int a, int b) {//static method with arg
		int c=a-b;
		System.out.println("substration:" +c);
	}
	public static void multiplication(int a, int b) {//static method with arg
		int c=a*b;
		System.out.println("multiplication:" +c);
	}
	public static void divition(int a, int b) {//static method with arg
		int c=a/b;
		System.out.println("divition:" +c);
	}
	
	public void add(int a, int b) {//non static method with arg
		int c=a+b;
		System.out.println("addition:" +c);
	}
	public  void sub(int a,int b) {//non static method with arg
		int c=a-b;
		System.out.println("substration:" +c);
	}
	public  void mult(int a, int b) {//non static method with arg
		int c=a*b;
		System.out.println("multiplication:" +c);
	}
	public void div(int a, int b) {//non static method with arg
		int c=a/b;
		System.out.println("divition:" +c);
	}



	public static void main(String[] args) {
		
	addition(23,34)	;//static calling
	substration(86,78);
	multiplication(45,9);
	divition(78,6);
	
	
	System.out.println("-----------------");
	
	
	METHODWITHARG x=new METHODWITHARG();//non static calling
	x.add(45,76);
	x.sub(67, 45);
	x.mult(56, 8);
	x.div(34, 6);
	}

}
