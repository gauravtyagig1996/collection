package linkedhashset;

import java.util.*;

class book11 {
	int id;
	String name, author, publisher;
	int quantity;

	public book11(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class Dequeue3 {
public static void main(String[] args) {    
    Deque<book11> set=new ArrayDeque<book11>();    
        
    book11 b1=new book11(101,"math","kothari","cv",13);    
    book11 b2=new book11(102,"account","firoz","gt",43);    
    book11 b3=new book11(103,"science","guru","kkt",65);    
   
    set.add(b1);    
    set.add(b2);    
    set.add(b3);    
     
    for(book11 b:set){    
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);    
    }    
}
}