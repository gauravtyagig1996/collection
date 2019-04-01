package collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExp {
	public static void main(String[] args) {
		LinkedList<Integer> valiExp = new LinkedList<>();
		valiExp.add(1);
		valiExp.add(2);
		valiExp.add(3);
		valiExp.add(4);
		valiExp.add(5);
		valiExp.add(6);
		valiExp.add(7);

		System.out.println(valiExp.size());
		Iterator<Integer> it = valiExp.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
