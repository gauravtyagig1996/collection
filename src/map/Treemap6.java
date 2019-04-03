package map;

import java.util.*;

class cook {
	int id;
	String name, author, publisher;
	int quantity;

	public cook(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public class Treemap6 {
		public void main(String[] args) {
			Map<Integer, cook> map = new TreeMap<Integer, cook>();
			cook b1 = new cook(11, "math", "gaurav", "kkt", 11);
			cook b2 = new cook(12, "science", "tyagi", "hkt", 22);
			cook b3 = new cook(13, "account", "saurav", "jay", 9);
			map.put(2, b2);
			map.put(1, b1);
			map.put(3, b3);

			for (Map.Entry<Integer, cook> entry : map.entrySet()) {
				int key = entry.getKey();
				cook b = entry.getValue();
				System.out.println(key + " details:");
				System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
			}
		}
	}

}
