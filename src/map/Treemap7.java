package map;

import java.util.*;

public class Treemap7 {
	// hashtable
	public static void main(String args[]) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();

		map.put(10, "gaurav");
		map.put(12, "tyagi");
		map.put(11, "ravi");
		map.put(13, "shivam");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
