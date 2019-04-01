package list;

import java.util.ArrayList;

public class Arraylist8 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("gaurav");
		list.add("saurav");
		list.add("ravi");
		list.add("rohit");
		list.add("ritu");
		System.out.println("an initial list of element" + list);
		// removing specific elements from arraylist
		list.remove("ravi");
		System.out.println("after invoking remove (object)method :" + list);
		// removing elements on the basis of specific position
		list.remove(0);
		System.out.println("After invoking remove (index)method:" + list);

		// creating another arraylist
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("kishan");
		list2.add("vishan");
		// Adding new elements to arraylist
		list.addAll(list2);
		System.out.println("updated list:" + list);
		// removing all the new elements from arraylist
		list.removeAll(list2);
		System.out.println("after invoke remove all()method"+list);
		// removing elements on the basis of specified condition
		list.removeIf(s -> s.contains("ritu"));
		System.out.println("after invoke remove if method :" + list);
		// removing all elements available in the list
		list.clear();
		System.out.println("after invoking clear method :" + list);

	}

}
