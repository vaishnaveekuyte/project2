package collections;

import java.util.ArrayList;

public class arraylists {
public static void main(String[]args) {
	
	ArrayList list=new ArrayList();//without restriction means does not declare any data type
	
	// accept all data type info
	
	
	
	list.add(123);          //int data type
	list.add("vaishnavee");    //string data type
	list.add(34.5f);           //float data type
	list.add('@');             //char data type
	
	int size=list.size();
	System.out.println(size);
	for(int i=0;i<size;i++) {
		System.out.println(list.get(i));
	}
	System.out.println("********************************************");
	list.remove(2);
	
	for(int i=0;i<size;i++) {
		System.out.println(list.get(i));
	}
	
	
}
}
