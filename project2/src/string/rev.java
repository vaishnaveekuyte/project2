package string;

public class rev {
	public static void main(String[] args) {
		System.out.println("****reverse string*****");
		String a="vaishnavee";
		String reverse= "";
		for(int i=a.length()-1;i>=0;i--) {
		reverse=reverse +a.charAt(i);	
		}
		System.out.println(reverse);
		
		
		System.out.println("******palendrom string*****");
		String b="radar";
		String rev="";
		for(int i=b.length()-1;i>=0;i--) {
			rev=rev + b.charAt(i);
			}
		
		if(b==rev) {
		
			System.out.println("given string is palendrom");
		}
		else {
			System.out.println("given string is not palendrom");
		}
		
		
		System.out.println("******palendrom string2*****");
		String k="level";
		String revt="";
		for(int i=b.length()-1;i>=0;i--) {
			revt=revt + k.charAt(i);
			}
		
		if(k.equals(revt)) {
		
			System.out.println("given string is palendrom");
		}
		else {
			System.out.println("given string is not palendrom");
		}
		
		
		
		System.out.println("****armstrong number****");
		
		int num=153;   //1+125+27=153
		int add=0;
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;
			add= add+ (rem*rem*rem);
			//System.out.println(add);
		}
		//System.out.println(add);
		if(num==add) {
			System.out.println("given num is armstrong");
		}
		else {
			System.out.println("given num is not armstrong ");
		}
		
	System.out.println("****armstrong number2****");
		
		int numb=1497;   //1+125+27=153
		int addi=0;
		for(int i=numb;i>0;i=i/10) {
			int remb=i%10;
			addi= addi+ (remb*remb*remb);
			//System.out.println(add);
		}
		//System.out.println(add);
		if(num==add) {
			System.out.println("given num is armstrong");
		}
		else {
			System.out.println("given num is not armstrong ");
		}
		System.out.println("****duplicate char *****");
		
		String s="ab a c d efg e h i";//duplicate char in given string
		int total=0;
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			//System.out.println(c);
			if(c=='a') {
				total++;
			}
				}
		System.out.println(total);

		
	System.out.println("****white spaces *****");
		
		String h="ab a c d efg e h i";//duplicate char in given string
		int t=0;
		for(int i=0;i<=s.length()-1;i++) {
			char c=h.charAt(i);
			//System.out.println(c);
			if(c==' ') {
				t++;
			}
				}
		System.out.println(t);
		
		
		System.out.println("***febonanci series****");//0 1 1 2 3 5 8 13 21 34
		int r= 0;
		int f= 1;
		int total1=10;
		
		int g;
		System.out.print(r+" "+f);
		for(int i=2;i<total1;i++) {
			g=r+f;
			System.out.print(" "+g);
			r=f;
			f=g;
		}
		
}	
	
	
}










