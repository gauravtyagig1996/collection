package list2;
import java.util.*;  
	class Book {  
		int id;  
		String name,author,publisher;  
		int quantity;  
		public Book(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}  
		}  
		public class Linkedlist5 {  
		public static void main(String[] args) {  
		   
		    List<Book> list=new LinkedList<Book>();  
		    //Creating Books  
		    Book b1=new Book(101,"math","Yashwant kedarnath","BPB",8);  
		    Book b2=new Book(102,"science Communications & Networking","vw.khan","Mc.kell",4);  
		    Book b3=new Book(103,"Operating System","Gaurav","Wiley",6);  
		    //Adding Books to list  
		    list.add(b1);  
		    list.add(b2);  
		    list.add(b3);  
		    //Traversing list  
		    for(Book b:list){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		}  

}
