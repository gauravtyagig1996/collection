package linkedhashset;

import java.util.*;

class book5{
	int id;
	String name,author,publisher;
	int quantity;
	
	public book5(int id,String name,String author,String publisher,int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	
}

public class Linkedhashset3 {
	public static void main(String[] args) {
		LinkedHashSet<book5> set=new LinkedHashSet<book5>();
		//creating book library
		book5 b1=new book5(101,"b.studies","tyagi","sharma",24);
		book5 b2=new book5(102,"account","gaurab","tyagi",32);
		book5 b3=new book5(103,"commarce","saurav","kk.sharma",45);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		//traversing hash table
		for(book5 b:set){
			System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.quantity);
		}
	}

}
