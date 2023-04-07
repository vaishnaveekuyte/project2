package TestPackage3;

public class Static3 {
	
	static int demo () {// user define method declaration 
		
		System.out.println("vaishnavee");
	
		int x=78;
		int y=67;
		int z=x+y;
		//System.out.println(z);//as pn lihl tar chalte ethe
		return z;
		
	}
	
			static String Test() {// user define method declaration 
			return "Testing";
		}
		public static void main(String[] args) {
			
		//	System.out.println("vaishnavee");//he ithe pn declaration kru skto
			
			int z=demo();// user define method int type data
			System.out.println(z);
		//demo();//he as pn kel tar chalte ya yevgi int z=demo();// user define method int type data
				
			String a=Test();// user define method string type data
			System.out.println(a);
			
			
		}
	}
	

	
			
	

