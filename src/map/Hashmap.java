package map;

import java.util.*;

public class Hashmap {
	 public static void main(String args[]){  
		   HashMap<Integer,String> map=new HashMap<Integer,String>();    
		    System.out.println("list of elements "+map);  
		      map.put(10,"gaurav");    
		      map.put(11,"tyagi");    
		      map.put(12,"vijay");   
		       
		      System.out.println("after invoking put method ");  
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		        
		      map.putIfAbsent(13, "kishan");  
		      System.out.println("after putIfAbsent method ");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      HashMap<Integer,String> map2=new HashMap<Integer,String>();  
		      map2.put(14,"ravi");  
		      map2.putAll(map);  
		      System.out.println("invoking putall method ");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		 }  

}
