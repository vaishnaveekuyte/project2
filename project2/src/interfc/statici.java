package interfc;

public class statici implements stint{
	public void show() {
		System.out.println("incomplete method is complete");
	}
	
	public static void main(String[] args) {
		
		statici x=new statici();
		x.show();
		stint.step1();
	}

}
