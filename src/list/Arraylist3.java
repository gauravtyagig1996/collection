package list;

import java.util.ArrayList;

public class Arraylist3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		for (String obj : list) {
			System.out.println(obj);
		}
	}

}
