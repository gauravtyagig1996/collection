package arraylict;
	
	import java.util.ArrayList;
	import java.util.Iterator;

	public class N4 {
		public static void main(String args[]){  
			ArrayList list=new ArrayList(); 
			list.add("gaurav");  
			list.add(20);  
			list.add(30);  
			list.add(40);  
			
			
		    Iterator it = list.iterator();
			while(it.hasNext()){  
			System.out.println(it.next());  
			}  
			}  

	}