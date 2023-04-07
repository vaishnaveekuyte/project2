package array;

import java.util.Arrays;

public class ascdsc {
	public static void main(String[] args) {
		
		int a[]= {10,45,60,70,56,34};//declaration of array
		
		int size=a.length-1;
		System.out.println(size);
		
		System.out.println("-----------all info-------");
		 for(int i=0; i<=a.length-1;i++) {
			 System.out.println(a[i]);
		 }
		 
		 System.out.println("----ascending------");
		
		 Arrays.sort(a);
		 for(int i=0; i<=a.length-1;i++) {
			 System.out.println(a[i]);
		 }
		 
		 
		 System.out.println("----dscending------");
			
		 
		 for(int i=a.length-1; i>=0;i--) {
			 System.out.println(a[i]);
		 }
	}

}
