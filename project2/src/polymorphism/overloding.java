package polymorphism;

public class overloding {
	public void add(int  a,int b) {
		System.out.println(a+b);
	}

	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	
	public  static void  add(float a,float b) {
		System.out.println(a+b);
	}

	public static void add(float a,float b,float c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		overloding x=new overloding();
		x.add(20, 40);
		x.add(10, 20,30);
		
		overloding.add(15.5f,20.5f );
		overloding.add(10.5f, 25.5f, 15.2f);
	}
}
