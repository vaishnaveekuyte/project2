package array;

public class multiarray {
	public static void main(String[] args) {
	int a [] []= {{11,12,13},{21,22,23},{31,32,33},{41,42,43}};	
	int b=a.length;
	System.out.println(b);
	
	for(int i=0; i<=3;i++) {
		
		for(int j=0;j<=2;j++) {
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	}
	
	}

}
