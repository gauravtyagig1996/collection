package list2;

import java.util.*;

public class Linkedlist1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("kishan");
		list.add("ravi");
		list.add("shivam");
		list.add("gaurav");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
