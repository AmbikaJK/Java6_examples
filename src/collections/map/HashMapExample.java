package collections.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {
	
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("2", "two");
		map.put("2", "one");
		map.put("2", "three");
		
		
		for (Entry<String, String> m: map.entrySet()) {
			System.out.println("key : " + m.getKey() + ", value : " + m.getValue());
		}
	}
}
