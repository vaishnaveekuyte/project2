package inheritance;

public class super2 extends super1 {//int a=24;
	
	int a=54;//global variable
	public void basic() {
		int a=57;//local variable
		System.out.println(a);//local variable
		
		System.out.println(this.a);//global variable from same class
		
		System.out.println(super.a);//global variable from  super class
		
	}
	public static void main(String[] args) {
		
		super2 y=new super2();
		y.basic();
	}

}
