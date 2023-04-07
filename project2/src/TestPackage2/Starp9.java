package TestPackage2;

public class Starp9 {
	public static void main(String[] args) {
		int i,j;
		for( i=1;i<=5;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print (j );	
			}
			System.out.println( );
		}
		System.out.println("------------------");
		
		int k,l;
		for( k=1;k<=5;k++) {
			
			for(l=1;l<=k;l++) {
				System.out.print (k);	
			}
			System.out.println( );
		
	}
		System.out.println("------------------");
		
		int m,n,h;
		int y=7;
		for( m=0;m<=y;m++) {
		h=1;	
			for(n=1;n<=m;n++) {
				System.out.print (h+" ");
				h++;
			}
			System.out.println( );
		
	}
		System.out.println("------------------");
		
		int spc=3;
		int str=1;
		int num=1;
		for(int p=1;p<=4;p++) {
			
			for(j=1;j<=spc;j++) {
				System.out.print (" ");
				
			}
			for(k=1;k<=str;k++) {
				System.out.print (num+" ");
				num++;
				
			}
			spc--;
			str=str+2;
			
			System.out.println( );
		
	}
}
}
