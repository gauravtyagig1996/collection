package linkedlist;

import java.util.*;

 public class N1 {
	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("gaurav");
		al.add("gaurav");
		al.add("gaurav");
		al.add("gaurav");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
