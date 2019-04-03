package map;

import java.util.*;

public class Hashtable3 {
	public static void main(String args[]) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(10, "gaurav");
		map.put(12, "saurav");
		map.put(11, "tyagi");
		map.put(13, "ravi");
		System.out.println(map.getOrDefault(11, "Not Found"));
		System.out.println(map.getOrDefault(15, "Not Found"));
	}

}
