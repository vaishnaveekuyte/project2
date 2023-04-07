package string;

public class sptmstr {
public static void main(String[] args) {
	System.out.println("split");
	
	String a="vai shna vee";
	String [] result=a.split(" ");
	for(int i=0;i<result.length;i++) {
		System.out.println(result[i]);
	}
	
	
	System.out.println("trim");
	
	String b="  vaishnavee  ";
	System.out.println("name:"+b.trim());
	b.length();
	System.out.println("before trim length is"+b.length());
	b=b.trim();
	int c=b.length();
	System.out.println("after trim length is"+c);
	
}
}
