package vector;

import java.util.Iterator;
import java.util.Vector;

public class N2 {
	public static void main(String args[]) {
		Vector<String> a = new Vector<String>();
		a.add("gaurav");
		a.add("shivam");
		a.add("ravi");
		a.add("kishan");
		Iterator<String> itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
