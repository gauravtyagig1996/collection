package map;

import java.util.*;

public class Linkedhashmap2 {
	public static void main(String args[]) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "gaurav");
		map.put(11, "vijay");
		map.put(12, "tyagi");
		
		System.out.println("keys " + map.keySet());
		System.out.println("values: " + map.values());
		System.out.println("key value pair " + map.entrySet());
	}

}
