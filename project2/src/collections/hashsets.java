package collections;

import java.util.HashSet;

public class hashsets {
public static void main(String[] args) {
	//order of insertion not maintain or random
 //not allow duplicate data or null value
		HashSet<Character> set =new HashSet<Character>();
		
		set.add('@');
		set.add('*');
		set.add('&');
		set.add('%');
		set.add('@');
		
//		for(char s:set) {
//	System.out.println(s);
//		}

		//advance for loop it is also 
		
		for(Object s:set) {
			System.out.println(s);
		}







}
}
