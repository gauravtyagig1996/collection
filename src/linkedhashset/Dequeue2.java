package linkedhashset;

import java.util.*;

public class Dequeue2 {
	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<String>();

		deque.offer("gaurav");
		deque.offer("saurav");
		deque.add("kishan");
		deque.offerFirst("rajesh");
		System.out.println("after offerfirst traversal...");
		for (String s : deque) {
			System.out.println(s);
		}

		deque.pollLast();
		System.out.println("after pollLast traversal...");
		for (String s : deque) {
			System.out.println(s);
		}
	}

}
