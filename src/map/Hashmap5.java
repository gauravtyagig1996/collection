package map;

import java.util.*;

class took {
	int id;
	String name, author, publisher;
	int quantity;

	public took(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public class Hashmap5 {
		public void main(String[] args) {
			Map<Integer, took> map = new Hashtable<Integer, took>();
			took b1 = new took(11, "math", "yash", "kkt", 42);
			took b2 = new took(12, "science", "faruk", "lalu", 21);
			took b3 = new took(13, "account", "kishan", "km pathak", 61);
			map.put(1, b1);
			map.put(2, b2);
			map.put(3, b3);
			for (Map.Entry<Integer, took> entry : map.entrySet()) {
				int key = entry.getKey();
				took b = entry.getValue();
				System.out.println(key + " details:");
				System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
			}
		}
	}

}
