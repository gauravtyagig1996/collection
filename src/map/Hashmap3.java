package map;

import java.util.*;

public class Hashmap3 {
	public static void main(String args[]){  
		   HashMap<Integer,String> map=new HashMap<Integer,String>();    
		      map.put(10,"gaurav");    
		      map.put(11,"tyagi");    
		      map.put(12,"saurav");   
		      System.out.println("initial list of elements:");  
		     for(Map.Entry m:map.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }  
		     System.out.println("updated list of elements:");  
		     map.replace(12, "kishan");  
		     for(Map.Entry m:map.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }  
		     System.out.println("updated list of elements:");  
		     map.replace(11, "Vijay", "Ravi");  
		     for(Map.Entry m:map.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }   
		     System.out.println("Updated list of elements:");  
		     map.replaceAll((k,v) -> "Ajay");  
		     for(Map.Entry m:map.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }  
		 }  

}
