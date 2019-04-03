package map;

import java.util.*;

public class Mapinterface4 {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "gaurav");
		map.put(11, "tyagi");
		map.put(12, "vijay");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);
	}

}
