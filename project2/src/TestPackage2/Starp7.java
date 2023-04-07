package TestPackage2;

public class Starp7 {
	public static void main(String[] args) {
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
		
	}
}
