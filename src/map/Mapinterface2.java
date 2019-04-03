package map;

import java.util.*;

public class Mapinterface2 {
	public static void main(String args[]){ 
		
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(10,"gaurav");  
		  map.put(11,"tyagi");  
		  map.put(12,"shivam");  
	  
		for (Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  

}
