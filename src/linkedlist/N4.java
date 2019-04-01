package linkedlist;
	import java.util.Iterator;
	import java.util.LinkedList;

	public class N4 {
		public static void main(String args[]) {
			LinkedList al = new LinkedList();
			al.add("gaurav");
			al.add(20);
			al.add(30);
			al.add("shivam");
			Iterator itr = al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	}