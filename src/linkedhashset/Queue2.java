package linkedhashset;

import java.util.*;

class book9 implements Comparable<book9> {
	int id;
	String name, author, publisher;
	int quantity;

	public book9(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int compareTo(book9 b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class Queue2 {
	public static void main(String[] args) {
		Queue<book9> queue = new PriorityQueue<book9>();

		book9 b1 = new book9(101, "math", "yashwant luhar", "kk.patel", 9);
		book9 b2 = new book9(133, "account", "gandhi", "rs.khanna", 21);
		book9 b3 = new book9(181, "science", "rahul", "kk.gill", 12);
		queue.add(b1);
		queue.add(b2);
		queue.add(b3);
		System.out.println("traversing the queue elements:");

		for (book9 b : queue) {

			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		queue.remove();
		System.out.println("after removing one book record:");
		for (book9 b : queue) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}