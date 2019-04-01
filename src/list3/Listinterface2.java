package list3;

import java.util.*;

public class Listinterface2 {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Amit");
		list.add("Vijay");
		list.add("Kumar");
		list.add(1, "Sachin");
		ListIterator<String> itr = list.listIterator();
		System.out.println("Traversing elements in forward direction");
		while (itr.hasNext()) {

			System.out.println("index:" + itr.nextIndex() + " value:" + itr.next());
		}
		System.out.println("Traversing elements in backward direction");
		while (itr.hasPrevious()) {

			System.out.println("index:" + itr.previousIndex() + " value:" + itr.previous());
		}
	}

}
