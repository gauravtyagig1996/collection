package linkedhashset;

import java.util.*;

public class Treeset5 {
	 public static void main(String args[]){  
		  TreeSet<String> set=new TreeSet<String>();  
		         set.add("a");  
		         set.add("b");  
		         set.add("c");  
		         set.add("d");  
		         set.add("e");  
		           
		         System.out.println("intial set: "+set);  
		           
		         System.out.println("head set: "+set.headSet("c"));  
		          
		         System.out.println("sub set: "+set.subSet("a", "e"));  
		           
		         System.out.println("tail set: "+set.tailSet("c"));  
		 }  

}
