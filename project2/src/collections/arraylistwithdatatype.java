package collections;

import java.util.ArrayList;

public class arraylistwithdatatype {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<Integer>();//with restriction means declar any data type
	
	//accept only declare data type info 
	// order of insertion maintain in arraylist
	list.add(123);
	list.add(675);
	list.add(3456);
	list.add(23);
	
	int size=list.size();
	System.out.println(size);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	System.out.println("********************************************");
	list.remove(2);
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}

}
}
