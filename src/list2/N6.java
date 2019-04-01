package list2;

import java.util.*;    
	
public class N6 {
	//arraylist
	
	 public static void main(String args[]){    
	     
	  List<String> list=new ArrayList<String>();   
	  list.add("Ravi");    
	  list.add("Vijay");    
	  list.add("Ravi");    
	  list.add("Ajay");    
	    
	  List<String> list2=new LinkedList<String>();    
	  list2.add("James");    
	  list2.add("Serena");    
	  list2.add("Swati");    
	  list2.add("Junaid");    
	    
	  System.out.println("arraylist: "+list);  
	  System.out.println("linkedlist: "+list2);  
	 }    

}
