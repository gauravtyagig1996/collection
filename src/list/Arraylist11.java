package list;

import java.util.ArrayList;

public class Arraylist11 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		System.out.println("Before update: " + list.get(1));
		// Updating an element at specific position
		list.set(1, "Gaurav");
		System.out.println("After update: " + list.get(1));
	}

}
