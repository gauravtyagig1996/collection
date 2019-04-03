package linkedhashset;

import java.util.*;

public class Linkedhashset2 {
	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("gaurav");
		set.add("saurav");
		set.add("tyagi");
		set.add("saurav");
		set.add("gaurav");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
