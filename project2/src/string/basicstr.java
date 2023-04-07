package string;

public class basicstr {
	public static void main(String[] args) {
	
	String a="vaishnavee";
	String b="vaishnavee";
	String c=new String("VAISHNAVEE");
	String d=new String("VAISHNAVEE");
	
	System.out.println(a==b); //true
	System.out.println(c==d); //false
	System.out.println(a==c); //false
	
	System.out.println("-----------------");
	
	b="testing";
	System.out.println(a);
	System.out.println(b);
	
	System.out.println(a==b);  //false
	
System.out.println("-----------------");
	
	b="vaishnavee";
	System.out.println(a);
	System.out.println(b);
	
	System.out.println(a==b);  //true
	
}
}