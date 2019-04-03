package map;

import java.util.*;

public class Treemap2 {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(10, "gaurav");
		map.put(12, "tyagi");
		map.put(11, "shivam");
		map.put(13, "kishan");
		System.out.println("before invoking remove method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.remove(12);
		System.out.println("after invoking remove method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
