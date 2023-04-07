package inheritance;

public class This {//this keyword
	int a=23;//global variable
	
	public void test() {
		int a=34;     //local variable
		
		System.out.println(a);    //local variable
		System.out.println(this.a);   //global variable 23
		
	}
	
	
	public void test1() {
		int a=56;//local variable
		System.out.println(a);//local variable
		
		System.out.println(this.a);//global variable
	}
	
	public static void main(String[] args) {
		This x=new This();
		x.test();
		x.test1();
		
		
	}

}
