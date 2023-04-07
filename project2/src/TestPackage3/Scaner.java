package TestPackage3;

	import java.util.Scanner;
	
public class Scaner {
	
	public static void main(String[] args) {
		
		Scanner number=new Scanner(System.in);//scanner class object
		
		System.out.println("enter any number: ");
		
		int value=number.nextInt();
		
		
		System.out.println("your entered value is:" +value);
		
		System.out.println();
		
	System.out.println("enter any  decimal number: ");
		
		float value2= number.nextFloat();
		
		System.out.println("your entered value is:" +value2);
		
		System.out.println();
		
	System.out.println("enter any name: ");
		
		String value3=number.next();
		
		System.out.println("your entered value is:" +value3);
		
		System.out.println();


		
		
	}

}
