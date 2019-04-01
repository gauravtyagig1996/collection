package stack;

import java.util.*;

public class N4 {
	public static void main(String args[]) {
		Stack ak = new Stack();
		ak.push(10);
		ak.push("Garvit");
		ak.push("Amit");
		ak.push(20);
		ak.push(40);
		ak.pop();
		Iterator it = ak.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
