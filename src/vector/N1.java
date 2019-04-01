package vector;

import java.util.*;

public class N1 {
	public static void main(String args[]) {
		Vector<String> av = new Vector<String>();
		av.add("gaurav");
		av.add("gaurav");
		av.add("gaurav");
		av.add("gaurav");
		Iterator<String> itr = av.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
