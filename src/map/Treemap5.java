package map;

import java.util.*;

public class Treemap5 {
	public static void main(String args[]) {
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "amit");
		map.put(102, "ravi");
		map.put(101, "vijay");
		map.put(13, "rahul");

		System.out.println("headMap " + map.headMap(102));
		System.out.println("tailMap: " + map.tailMap(102));
		System.out.println("subMap: " + map.subMap(100, 102));
	}

}
