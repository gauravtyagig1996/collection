package map;

import java.util.*;

public class Treemap {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "gaurav");
		map.put(12, "kishan");
		map.put(11, "kiran");
		map.put(13, "saurav");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
