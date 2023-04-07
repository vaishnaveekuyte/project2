package casting;

public class testcasting {
	
	public static void main(String[] args) {
		
		System.out.println("********superclass***************");
		
		upcasting x=new upcasting();
		x.rest();
		x.test();
		x.demo();
		

		System.out.println("********subclass***************");
		
		upcast1 y=new upcast1();
		y.rest();
		y.test();
		y.memo();
		
		System.out.println("********upcasting***************");
		
		upcasting z=new upcast1();
		y.rest();
		y.test();
		y.demo();
		
		
		System.out.println("********downcasting***************");
		
		upcast1 a=(upcast1)new upcasting();
		a.rest();
		a.test();
		a.demo();
		a.memo();
		
		
	}
}