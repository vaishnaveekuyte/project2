package collections;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class hashtable {

	public static void main(String[] args) {
		//order of insertion not maintain or random
	 //not allow duplicate data or null value
			Hashtable<Integer,String> table =new Hashtable<Integer,String>();
			
			table.put(45, "vaishnavee");
			table.put(15, null);
			table.put(65, "xyz");
			table.put(34, "kuyte");
			table.put(78, null);
			
//multiple key declare  a null the no compiler error show but runtime exception show is  nullpointerexception
//hashtable accept multiple null value but not accept null key
			//advance for loop it is also know as for each
			
			for(Map.Entry<Integer, String> T : table.entrySet()) {
				System.out.println("Key" + T.getKey() + " Value" + T.getValue());
			}







	}
}
