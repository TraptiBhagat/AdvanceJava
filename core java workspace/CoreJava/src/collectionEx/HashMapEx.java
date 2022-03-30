package collectionEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(null, "Zero");
		map.put("0", null);
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");

		/* String val = (String) map.get("2");
		map.remove("1");
		Set keys = map.keySet();
		for(Object k : keys) {
		System.out.println(k);
		
		
		Collection vals = map.values();
		for(Object v : vals) {
			System.out.println(v);
		}*/
		
		Set keyValue = map.entrySet();
		for(Object ele : keyValue) {
			Map.Entry pair = (Map.Entry) ele;
			System.out.println(pair.getKey() + "-" + pair.getValue());
		}
	}
}
