package TestPackage2;

public class Starp8 {
	public static void main(String[] args) {
		int spc =3;
			int str=1;
			for(int i =1;i<=7;i++) {
				
				for( int j=1;j<=spc;j++) {
					
					System.out.print("   ");
					}
				
				for(int  k=1;k<=str;k++) 
					
					System.out.print(" * ");
				
				
				
					System.out.println();
					if(i<=3) {
						spc--;
						str=str+2;
					}
					else {
						spc++;
						str=str-2;
					}
								}
			

}
}