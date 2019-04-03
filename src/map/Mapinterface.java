package map;

import java.util.*;

public class Mapinterface {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		// Adding elements to map
		map.put(1, "gaurav");
		map.put(3, "tyagi");
		map.put(2, "saurav");
		map.put(4, "ajay");

		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {

			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}