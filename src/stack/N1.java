package stack;

import java.util.*;

public class N1 {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("gaurav");
		stack.push("Garvit");
		stack.push("saurav");
		stack.push("Ashish");
		stack.push("amit");
		
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
