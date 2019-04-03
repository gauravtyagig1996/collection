package map;

import java.util.*;

public class Hashtable2 {
	public static void main(String args[]) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(10, "gaurav");
		map.put(12, "tyagi");
		map.put(11, "shivam");
		map.put(13, "ravi");
		System.out.println("before remove: " + map);
		map.remove(12);
		System.out.println("after remove: " + map);
	}

}
