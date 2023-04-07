package TestPackage3;

import java.util.Scanner;

public class Scnner2 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sum =new Scanner(System.in);
		
		System.out.println(" enter number: ");
		a=sum.nextInt();
		b=sum.nextInt();
		
		c=a+b;
		System.out.println("addition of a+b: " +c);
		
		System.out.println("--------------");
		
		Scanner sub =new Scanner(System.in);
		
		System.out.println(" enter number: ");
		a=sum.nextInt();
		b=sum.nextInt();
		
		c=a-b;
		System.out.println("substration of a-b: " +c);
		
		System.out.println("--------------");
		
		Scanner mul =new Scanner(System.in);
		
		System.out.println(" enter number: ");
		a=sum.nextInt();
		b=sum.nextInt();
		
		c=a*b;
		System.out.println("multiplication of a*b: " +c);
		
		System.out.println("--------------");
		
		Scanner div =new Scanner(System.in);
		
		System.out.println(" enter number: ");
		a=sum.nextInt();
		b=sum.nextInt();
		
		c=a/b;
		System.out.println("divition of a/b: " +c);
		
		System.out.println("--------------");

				
		

		
	}
	
	

}
