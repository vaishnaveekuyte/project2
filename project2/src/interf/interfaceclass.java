package interf;

public class interfaceclass implements intre1,intre2 {
	
	public void addition() {
		int a=20;
		int b=30;
		int c=a+b;
		
		System.out.println("addition :" +c);
	}
	
	public void substration() {
		int a=70;
		int b=30;
		int c=a-b;
		
		
		System.out.println("substration :"+c);
	}

	public void multiplication() {
		int a=10;
		int b=30;
		int c=a*b;
		
		
		System.out.println("multiplication :"+c);
	}
	
	public void divition() {
		int a=30;
		int b=3;
		int c=a/b;
		
		
		System.out.println("divition :"+c);
	}
	
	
public static void main(String[] args) {
		
		interfaceclass x=new interfaceclass();
		x.addition();
		x.substration();
		x.multiplication();
		x.divition();
		
	}

}
