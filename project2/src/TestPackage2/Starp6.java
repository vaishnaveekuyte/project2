package TestPackage2;

public class Starp6 {
	public static void main(String[] args) {
		//program1
		int spc =3;
		int str=1;
		
		for(int i =1;i<=4;i++) {
			
			for( int j=1;j<=spc;j++) {
				System.out.print(" ");
				
			}
			for(int  k=1;k<=str;k++) { 
				System.out.print("*");
			}
				System.out.println();
				spc--;
				str=str+2;
				
			
			
		}
		//program2
				System.out.println("-----------------");
	
		int space =0;
		int star=7;
		
		for(int i =1;i<=4;i++) {
			
			for( int j=1;j<=space;j++) {
				System.out.print(" ");
				
			}
			for(int  k=1;k<=star;k++) { 
				System.out.print("*");
			}
				System.out.println();
				space++;
				star=star-2;
		}	
	//program3	
		System.out.println("-------------");
		
		int spaces =3;
		int stars=1;
		
		for(int i =1;i<=4;i++) {
			
			for( int j=1;j<=spaces;j++) {
				System.out.print(" ");
				
			}
			for(int  k=1;k<=stars;k++) { 
				System.out.print("*");
				
				
			}
				System.out.println();
				spaces--;
				stars++;
				
			
			
		}


		//program4	
				System.out.println("-------------");
				
				int spacs =0;
				int strs=4;
				
				for(int i =1;i<=4;i++) {
					
					for( int j=1;j<=spacs;j++) {
						System.out.print(" ");
						
					}
					for(int  k=1;k<=strs;k++) { 
						System.out.print("*");
					}
						System.out.println();
						spacs++;
						strs--;
						
					
					
				}







}
}
