package practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class thirtyeight_HashMapInsertedOrder {

	public static void main(String[] a) {
		Map<String, String> map = new LinkedHashMap<String, String>();
//		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "3");
		map.put("name", "shyam");
		
		map.put("age", "26");
//		Collections.synchronizedMap(map);
		System.out.println(map);
		 
//		for (Map.Entry<String, String> entry : map.entrySet()) {
//		    System.out.println(entry.getKey() + " = " + entry.getValue());
//		}
	  }

}
