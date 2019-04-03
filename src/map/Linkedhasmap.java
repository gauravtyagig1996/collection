package map;

import java.util.*;

public class Linkedhasmap {
	public static void main(String args[]){  
		   
		  LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();  
		  
		  map.put(10,"gaurav");  
		  map.put(11,"tyagi");  
		  map.put(12,"saurav");  
		  
		for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  

}
