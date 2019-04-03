package map;

import java.util.*;

class kook {
	int id;
	String name, author, publisher;
	int quantity;

	public kook(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

public class Linkedhashmap {
	public void main(String[] args) {        
	    Map<Integer,kook> map=new LinkedHashMap<Integer,kook>();    
	    
	    kook b1=new kook(11,"math","kishor","kkt",11);    
	    kook b2=new kook(12,"commarce","luhar","kp singh",22);    
	    kook b3=new kook(13,"account","kavin","tyagi",33);    
	    
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	       
	    for(Map.Entry<Integer, kook> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        kook b=entry.getValue();  
	        System.out.println(key+" details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    
	}    
}
}