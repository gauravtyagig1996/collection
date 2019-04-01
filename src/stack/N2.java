package stack;

import java.util.*;

public class N2 {
	public static void main(String args[]) {
		Stack<String> list = new Stack<String>();
		list.push("gaurav");
		list.push("gaurav");
		list.push("gaurav");
		list.push("gaurav");
		list.push("gaurav");
		
		list.pop();
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
