package list;

import java.util.*;

public class Arraylist9 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("gaurav");
		list.add("shivam");
		list.add("shivani");
		list.add("ritu");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("ritu");
		list2.add("kusum");
		
		list.retainAll(list2);
		System.out.println("iterating the element after retaining the element of list2");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext());{
			System.out.println(itr.next());
		}
	}

}
