package linkedlist;
	
	import java.util.Iterator;
import java.util.LinkedList;

	 public class N2 {
		public static void main(String args[]) {
			LinkedList<String> al = new LinkedList<String>();
			al.add("gaurav");
			al.add("saurav");
			al.add("kishan");
			al.add("vishan");
			Iterator<String> itr = al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	}