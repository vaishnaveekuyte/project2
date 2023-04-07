package array;

public class swaparray {
	
	public static void main(String[] args) {
		System.out.println("----before swaping---");
		int a[]= {16,29,20,65,12,57};
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		
		//a[0]=a[3] last indox-0;
		//a[1]=a[2] last indox-1;
		
		System.out.println("----after swaping---");
		for(int i=0;i<(a.length/2);i++) {
			int c;
			c=a[i];//16 c=16;
			a[i]=a[(a.length-1)-i];
			//a[3];i=0 because of first iteration
			//a[i]=a[5]65;
			
			a[i]=a[(a.length-1)-i]=c;
			//a.length=6;i=0;
			//(a.length-1) i=5;
			//a[5]=c and c=10 so a[5]=16
			
		
		System.out.println();
		//System.out.println(a[0]);
		//System.out.println(a[3]);
		}
		  
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		
	}

}
