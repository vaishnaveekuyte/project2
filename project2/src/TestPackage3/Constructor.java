package TestPackage3;

public class Constructor {
	Constructor()  //user defined constructor
	{
		
	}
	
    int x=5;           //constructor
    String y="vaishnavee";
    
    
    
    int g;            // default constructor
    String p;
    
    
    
  public void  Const1 (int a,int b) {  //constructor in non static with argument
    	
    		int c=a+b;
    		System.out.println(c);
    }
    
  public void  Const2() {  //constructor in  non static without argument
    	int v=34;
    	int t=23;
		int r=v-t;
		System.out.println(r);
		
}
    
    
    public static void main(String[] args) {
    	 Constructor C = new Constructor();//object creation for constructor
		 
		 System.out.println(C.x);      //constructor calling
		 System.out.println(C.y);
		 
		 
		 System.out.println(C.g);      // default constructor calling
		 System.out.println(C.p);
		 

		 Constructor x=new Constructor();//object creation for non static constructor
		 
		 x.Const1(34,54);//constructor in non static with and without argument calling

		 
		 
		 x.Const2();//constructor in non static without argument calling
		 
		
		
		 		
		 
		 
	}

}
