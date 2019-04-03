package map;

import java.util.*;

public class Mapinterface3 {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "gaurav");
		map.put(11, "vijay");
		map.put(12, "rahul");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}

}
