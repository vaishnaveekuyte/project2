package string;
public class methodst {
	public static void main(String[] args) {
		String a="vaishnavee";
		String b="Vaishnavee";
		String c="vaishu";
		System.out.println("******1*******");
		System.out.println(a.charAt(5));				//return type string or char
		System.out.println("******2*******");
		System.out.println(b.replace("v","y"));			//return type string
		System.out.println("******3*******");
		System.out.println(c.concat(b));				//return type string
		System.out.println("******4*******");
		System.out.println(a.substring(4));				//return type string
		System.out.println("******5*******");
		System.out.println(b.substring(5, 9));			//return type string
		System.out.println("******6*******");
		System.out.println(b.isEmpty());				//return type boolean
		System.out.println("******7*******");
		System.out.println(a.startsWith("va"));			//return type boolean
		System.out.println("******8*******");
		System.out.println(b.endsWith(a));				//return type boolean
		System.out.println("******9*******");
		System.out.println(b.indexOf("a"));				//return type int
		System.out.println("******10*******");
		System.out.println((a.length()-1));//count index	//return type int
		System.out.println("******11*******");
		System.out.println(a.length());					//return type int
		System.out.println("******12*******");
		System.out.println(b.contains(a));				//return type boolean
		System.out.println("******13*******");
		System.out.println(b.equals(a));					//return type boolean
		System.out.println("******14*******");
		System.out.println(b==a);							//return type boolean
		System.out.println("******15*******");
		System.out.println(a.lastIndexOf("v"));				//return type int
		System.out.println("******16*******");
		System.out.println(b.equalsIgnoreCase(a));			//return type boolean
		System.out.println("******17*******");
		System.out.println(a.toUpperCase());				//return type string
		System.out.println("******18*******");
		System.out.println(a.toLowerCase());			//return type string
		System.out.println("******19*******");
		String d=String.join(a, b,c);				//return type string
		System.out.println(d);
		
		
		}
		
				}


