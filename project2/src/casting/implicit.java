package casting;

public class implicit {
	public static void main(String[] args) {
		byte a=70;//memory size is 1 byte
		System.out.println(a);
		
		int b=a;//memory size is 4 byte
		System.out.println(b);
		
		double c=b;//memory size is 8 byte
		System.out.println(c);
		
	}

}
