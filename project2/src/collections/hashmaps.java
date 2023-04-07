package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmaps {
public static void main(String[] args) {
	HashMap<Integer,String> map =new HashMap<Integer,String>();

//order of insertion in random we can declare duplicate as wel as null value and key in hashmap
  map.put(23, null);//first is key and second is value means 23 is key and value is null
 
  map.put(null, "vaishnavee");

  map.put(12, "kuyte");

  map.put(null, null);

//advance for loop
for(Entry<Integer,String> m :map.entrySet()) {
	System.out.println("key=" + m.getKey() + " value=" + m.getValue());
}

System.out.println("**************************");

map.put(78, "abc");

for(Entry<Integer,String> m :map.entrySet()) {
	System.out.println("key=" + m.getKey() + " value=" + m.getValue());
}







}
}
