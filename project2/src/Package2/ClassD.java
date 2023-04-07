package Package2;

import Package1.ClassA;

public class ClassD extends ClassA {
	public static void main(String[] args) {
		
	
	ClassD x=new ClassD();
	System.out.println(x.student);//public access in anther class and anther package
	//System.out.println(x.marks);
	System.out.println(x.submarks);//protected access in anther class and anther package but use in inheritance condition
	//System.out.println(x.avg);
	}

}
