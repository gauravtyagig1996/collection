package list;

import java.util.ArrayList;
import java.util.List;

class Array12 {
	int id;
	String name,author,publisher;
	int quantity;
	
	public Array12(int id,String name,String author,String publisher,int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}

}
public class Arraylist12{
	public static void main(String[] args) {
		List<Array12> list=new ArrayList<Array12>();
		Array12 b1=new Array12(101,"math","gaurav","kumar",8);
		Array12 b2=new Array12(102,"english","kishan","gupta",9);
		Array12 b3=new Array12(103,"commarce","saurav","kishor",81);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Array12 b:list){
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
