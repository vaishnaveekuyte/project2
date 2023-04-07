package TestPackage3;

public class Static5 {//call in different class
	public static void main(String[] args) {
		
		Static4 x= new Static4();//object creation
	x.vaishu();//non static method call from  different class
	
	Static4.kuyte();//static method call from  different class
}	

}
