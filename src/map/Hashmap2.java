package map;

import java.util.*;

public class Hashmap2 {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "gaurav");
		map.put(11, "tyagi");
		map.put(12, "saurav");
		map.put(13, "ravi");
		System.out.println("initial list of elements: " + map);
		map.remove(10);
		System.out.println("updated list of elements: " + map);
		map.remove(11);
		System.out.println("updated list of elements: " + map);
		map.remove(12, "Rahul");
		System.out.println("Updated list of elements: " + map);
	}

}
