package TestPackage3;

public class staticnonstaticvaiable {
	static int a=10;//static variable
	int b=20;// non static variable
	float c=40.4f;
	public static void main(String[] args) {
		System.out.println("static variable:" +a);
		
		staticnonstaticvaiable x=new staticnonstaticvaiable();
		
		System.out.println(" non static variable with ref x:"+ x.b);//20
		
		
		staticnonstaticvaiable y=new staticnonstaticvaiable();
		
		System.out.println(" non static variable with ref y:"+ y.b);//20

		x.b=30;
		System.out.println(" non static variable with ref x:"+ x.b);//30
		System.out.println(" non static variable with ref y:"+ y.b);//20
		
		System.out.println("  static variable with ref x:"+ x.a);//10
		System.out.println("  static variable with ref y:"+ y.a);//10
		
		x.a=50;
		
		System.out.println("  static variable with ref x update:"+ x.a);//50
		System.out.println("  static variable with ref y update:"+ y.a);//50

		
	}
	

}
