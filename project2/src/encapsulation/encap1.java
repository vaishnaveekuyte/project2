package encapsulation;

public class encap1 {
	
	private int a=10;
	private int b=20;
	
	encap1(){
		a=30;
		b=40;
	}
	
	encap1(int c,int d){
		a=c;
		b=d;
	}
	public void test() {
		System.out.println(a+b);
	}
	
}
