package linkedhashset;

import java.util.*;

public class Treeset3 {
	public static void main(String args[]) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(22);
		set.add(77);
		set.add(99);
		set.add(44);
		System.out.println("Highest Value: " + set.pollFirst());
		System.out.println("Lowest Value: " + set.pollLast());
	}

}
