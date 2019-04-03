package map;

import java.util.*;

public class Linkedhashmap3 {
	public static void main(String args[]) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(11, "gaurav");
		map.put(12, "tyagi");
		map.put(13, "saurav");
		System.out.println("before invoking remove method " + map);
		map.remove(12);
		System.out.println("after invoking remove method " + map);
	}

}
