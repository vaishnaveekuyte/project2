package string;

public class vai {
	public static void main(String[] args) {
	
	
	String s="vaishnavee";
	char str[]=s.toCharArray();
	
	int total=0;
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		//System.out.println(c);
		if(c=='a') {
			
			total++;
		}
		
		if(str[i]=='a') {
			System.out.println("name of char:"+str[i]);
		}
		//else {
		//	System.out.println("default");
		//}
			}
	System.out.println("value of char:"+total);
	
	}
}

