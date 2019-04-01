package vector;

	import java.util.Iterator;
	import java.util.Vector;

	public class N4 {
		public static void main(String args[]) {
			Vector list = new Vector();
			list.add("gaurav");
			list.add(20);
			list.add(30);
			list.add("saurav");
			Iterator it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}