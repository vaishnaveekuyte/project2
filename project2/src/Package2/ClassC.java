package Package2;

import Package1.ClassA;

public class ClassC   {
	public static void main(String[] args) {
		
	
	ClassA x=new ClassA();
	System.out.println(x.student);//public access in anther class and anther package
	//System.out.println(x.marks);
	//System.out.println(x.submarks);//protected access in anther class and anther package but use in inheritance condition
//	System.out.println(x.avg);
	
	}
}
