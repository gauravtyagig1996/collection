package vector;

import java.util.Iterator;
import java.util.Vector;

public class N3 {
	public static void main(String args[]) {
		Vector<Integer> list = new Vector<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}