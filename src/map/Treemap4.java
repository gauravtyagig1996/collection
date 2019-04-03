package map;

import java.util.*;

public class Treemap4 {
	public static void main(String args[]) {
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(109, "gaurav");
		map.put(122, "faruk");
		map.put(11, "shivam");
		map.put(103, "tyagi");

		System.out.println("descendingmap " + map.descendingMap());
		System.out.println("headmap: " + map.headMap(122, true));
		System.out.println("tailmap: " + map.tailMap(122, true));
		System.out.println("submap: " + map.subMap(109, false, 122, true));
	}

}
