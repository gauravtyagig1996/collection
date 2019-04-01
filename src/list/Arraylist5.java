package list;

import java.util.ArrayList;
import java.util.Iterator;

class student32 {
	int rollno;
	String name;
	int age;

	student32(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

public class Arraylist5 {
	public static void main(String[] args) {
		student32 s1 = new student32(101, "gaurav", 32);
		student32 s2 = new student32(102, "saurav", 42);
		student32 s3 = new student32(103, "ravi", 23);

		ArrayList<student32> list = new ArrayList<student32>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			student32 st = (student32) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
