package TestPackage2;

public class Nestedif {
	public static void main(String[] args) {
		String UN="vaishnavee";
		String PW="8888@k";
		if(UN=="vaishnavee") {
			System.out.println("user name is correct");
			if(PW=="8888@k") {
				System.out.println("passward is correct");
				System.out.println("login successfully");
			}
			else {
				System.out.println("passward is incorrect");
				System.out.println("login failed");
			}
			 
					}
		else {
			System.out.println("user name is incorrect");
			System.out.println("login failed");
		}
		
	}

}
