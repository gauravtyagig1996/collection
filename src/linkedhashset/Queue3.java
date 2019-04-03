package linkedhashset;

import java.util.*;

public class Queue3 {
	// array d-queue
	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<String>();
		deque.add("gaurav");
		deque.add("saurav");
		deque.add("tyagi");

		for (String str : deque) {
			System.out.println(str);
		}
	}

}
