package inheritance;

public class callABC extends ABC {
	public void rest() {
		System.out.println("implemented method");
	}
	public void demo2() {
		System.out.println("demo2 method is implemented");
	}
	public static void main(String[] args) {
		
		callABC x=new callABC();
		x.rest();
		x.demo2();
		x.test();
		
	}
	
}
