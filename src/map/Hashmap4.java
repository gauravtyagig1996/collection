package map;

import java.util.*;

class bookl {
	int id;
	String name, author, publisher;
	int quantity;

	public bookl(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public class Hashmap4 {
		public void main(String[] args) {

			Map<Integer, bookl> map = new HashMap<Integer, bookl>();

			bookl b1 = new bookl(11, "math", "kishor", "kishan", 11);
			bookl b2 = new bookl(12, "science", "gaurav", "miraj", 18);
			bookl b3 = new bookl(13, "account", "shivam", "akash", 6);
			map.put(1, b1);
			map.put(2, b2);
			map.put(3, b3);

			for (Map.Entry<Integer, bookl> entry : map.entrySet()) {
				int key = entry.getKey();
				bookl b = entry.getValue();
				System.out.println(key + " details:");
				System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
			}
		}
	}

}
