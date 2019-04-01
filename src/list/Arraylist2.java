package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
				}

}
