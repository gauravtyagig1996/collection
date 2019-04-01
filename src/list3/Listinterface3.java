package list3;

import java.util.*;  

class Book1 {
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book1(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  

}
public class Listinterface3{
	 public static void main(String[] args) {  
		    //Creating list of Books  
		    List<Book1> list=new ArrayList<Book1>();  
		    Book1 b1=new Book1(101,"math","Yashwant","BPB",8);  
		    Book1 b2=new Book1(102,"science","Foroz","Mc gill",4);  
		    Book1 b3=new Book1(103,"oops","Gaurav","Wiley",6);  
		   
		    list.add(b1);  
		    list.add(b2);  
		    list.add(b3);  
		  
		    for(Book1 b:list){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		}  
	 
}

