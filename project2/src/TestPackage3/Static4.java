package TestPackage3;

public class Static4 {//static method declare in same class and call in same class

	
	
	//only static program
	
	public static void demo() {//user defined method declaration
	System.out.println("demo method running ");

}
	public static void test() {//user defined static method declaration
		System.out.println("test method running ");
	
}
	
	
	
	//static as well as non static program
	
	public void vaishu() {// non static method declare in same class and call in same class as well as different class
		System.out.println("vaishu is a name");//user defined non static method declaration
	}
	public static void kuyte() {//user defined static method declaration
		System.out.println("kuyte is a surname ");
	
}
	
	
	
	
	public static void main(String[] args) {
		demo();
		test();
		
		
		Static4 x =new Static4();
		
		x.vaishu();//non static method calling in same class
		kuyte();//static method calling in same class
		
	}
	
	
}
