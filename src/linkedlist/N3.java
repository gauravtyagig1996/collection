package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class N3 {
	public static void main(String args[]) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
