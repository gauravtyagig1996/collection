package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		System.out.println("iteration in reverse order");
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			System.out.println(list1.previous());
			//String str = list1.previous();
			//System.out.println(str);
		}
		System.out.println("traversing iteration foreach method");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("traversing iteration foreach method");
		list.forEach(a -> {
			System.out.println(a);
		});

		System.out.println("traversing foreach remaining method");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> {
			System.out.println(a);
		});
	}

}
