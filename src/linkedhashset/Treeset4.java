package linkedhashset;

import java.util.*;

public class Treeset4 {
	public static void main(String args[]){  
		  TreeSet<String> list=new TreeSet<String>();  
		         list.add("a");  
		         list.add("b");  
		         list.add("c");  
		         list.add("d");  
		         list.add("e");  
		         System.out.println("initial set: "+list);  
		           
		         System.out.println("reverse set: "+list.descendingSet());  
		           
		         System.out.println("head set: "+list.headSet("c", true));  
		          
		         System.out.println("sub set: "+list.subSet("a", false, "e", true));  
		           
		         System.out.println("tail set: "+list.tailSet("c", false));  
		 }  

}
