package polymorphism;

public class riding2 extends riding{
	public void statement() {
		System.out.println("method from subclass");
	}
	public static void main(String[] args) {
		
		riding2 x=new riding2();
		x.statement();
		x.abc();
		
		riding y=new riding();
		y.statement();
	}

}
