package collection.list;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExp {
	public static void main(String[] args) {
		HashSet<String> valiEts = new HashSet<>();
		valiEts.add("Hello");
		valiEts.add(null);
		valiEts.add("J1");
		valiEts.add("J2");
		valiEts.add("J3");
		valiEts.add("J1");
		System.out.println(valiEts);
		Iterator<String> it= valiEts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

	}
}
