package interfc;

public class defaultclass implements defaultt {
	public void test() {
		System.out.println("testing the test method");
	}
	
	public static void main(String[] args) {
		
		defaultclass x=new defaultclass();
		x.test();
	}

}
