package list;

import java.util.ArrayList;

public class Arraylist7 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("initial list of elements"+list);
		list.add("gaurav");
		list.add("saurav");
		list.add("ravi");
		System.out.println("after invokind add method"+list);
		list.add(1,"rajesh");
		//adding an element on a specific position
		System.out.println("after invoking add(int index E element)method"+list);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("sonoo");
		list2.add("suraj");
		//adding second list element to the first list
		list.addAll(list2);
		System.out.println("after invoking add all(collection<?ExtendsE>c)method"+list);
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("john");
		list3.add("rahul");
		//Adding second list elements to the first list at specific position
		list.addAll(1,list3);
		System.out.println("After invoking AddAll"+list);
		

	}
}
