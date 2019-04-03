package linkedhashset;

import java.util.*;

public class LinkedHashset1 {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Saurav");
		set.add("Gaurav");
		set.add("Ravi");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
