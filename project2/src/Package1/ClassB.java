package Package1;

public class ClassB {
	public static void main(String[] args) {
		ClassA Y=new ClassA();
		System.out.println(Y.student);//public access in anther class but same package
		//System.out.println(Y.marks);
		System.out.println(Y.submarks);//protected access in anther class but same package
		System.out.println(Y.avg);//default access in anther class but same package
		
	}
	

}
