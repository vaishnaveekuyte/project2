package newpackage;

public class assi1 {
	static int a=10;  //global variable static
	int b=20;         //global variable  non static

	public void abc() {
		int a=30;     //local variable
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
	}
	public static void main(String[] args) {
		
		assi1 x=new assi1();
		x.abc();
		
	}
}
