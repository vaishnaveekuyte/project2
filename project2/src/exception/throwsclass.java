package exception;

public class throwsclass {
	static void test() {
		throw new NullPointerException();
		
	}
	static void demo() {
		throw new ArithmeticException();
	}

public static void main(String[]args) throws InterruptedException {
	int a=80;
	int b=0;
	int c=a/b;
	System.out.println(c);
	System.out.println("main method running");
	//demo();
	test();
	Thread.sleep(2000);
}


}
