package map;

import java.util.*;

public class Hashtable4 {
	public static void main(String args[]) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(10, "gaurav");
		map.put(12, "tyagi");
		map.put(11, "shivam");
		map.put(13, "sharma");
		System.out.println("initial map: " + map);
		map.putIfAbsent(14, "kishor");
		System.out.println("updated map: " + map);
		map.putIfAbsent(101, "vijay");
		System.out.println("updated map: " + map);
	}

}
