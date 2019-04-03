package linkedhashset;

import java.util.*;

class book8 implements Comparable<book8> {
	int id;
	String name, author, publisher;
	int quantity;

	public book8(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int compareTo(book8 b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class Treeset6 {
	public static void main(String[] args) {
		Set<book8> set = new TreeSet<book8>();

		book8 b1 = new book8(101, "commarce", "kumar", "kk.tyagi", 11);
		book8 b2 = new book8(102, "account", "saurav", "sharma", 1);
		book8 b3 = new book8(100, "math", "gaurav", "kl.gill", 18);

		set.add(b1);
		set.add(b2);
		set.add(b3);
		for (book8 b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}