package polymorphism;

public class testhide extends methodhide {
	
	public static void test() {
		System.out.println("sub class is running");
	}
	public static void main(String[] args) {
		
		testhide x=new testhide();
		x.test();
		
		//methodhide v=new methodhide();
		//v.test();
	}
}
