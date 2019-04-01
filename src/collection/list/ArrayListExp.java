package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExp {

	public static void main(String[] args) {
		ArrayList<String> valList=  new ArrayList();
		valList.add("A");
		valList.add("B");
		valList.add("C");
		valList.add("D");
		valList.add("E");
		valList.add("F");
		System.out.println("Size "+valList.size());
		System.out.println(valList);
		Iterator<String> it= valList.iterator();
		while(it.hasNext()){
		System.out.println(it.next());	
		}
	}

}
