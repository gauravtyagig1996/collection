package list3;

import java.util.*;

public class Listinterface1 {
	public static void main(String args[]){  
		List<String> list=new ArrayList<String>();  
		list.add("Amit");  
		list.add("Vijay");  
		list.add("Kumar");  
		list.add(1,"Sachin");  
		System.out.println("An element at 2nd position: "+list.get(2));  
		for(String s:list){  
		 System.out.println(s);  
		}  
		}  

}
