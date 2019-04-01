package list2;

import java.util.*;

public class Linkedlist2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		System.out.println("initial list of element");
		list.add("ravi");
		list.add("gaurav");
		list.add("kishan");
		System.out.println("after invoke (E e)method" + list);
		// adding an element at the specific position
		list.add(1, "kashi");
		System.out.println("after invoke add" + list);
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("kishor");
		list2.add("kishori");
		// adding second list element to the first list
		list2.addAll(list2);
		System.out.println("after invoke add all method:" + list);
		LinkedList<String> list3 = new LinkedList<String>();
		list3.add("saurav");
		list3.add("rohit");

		// adding second list elements to the first list at specific position
		list.addAll(1, list3);
		System.out.println("afterv adding list 3" + list);

		list.addFirst("Lokesh");
		System.out.println("after invoke add first method" + list);
		list.addLast("harash");
		System.out.println("after invoke addlast method" + list);
	}

}
