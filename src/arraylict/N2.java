package arraylict;
	import java.util.ArrayList;
	import java.util.Iterator;

	public class N2 {
		public static void main(String args[]){  
			ArrayList<String> list=new ArrayList<String>(); 
			list.add("gaurav");  
			list.add("saurav");  
			list.add("shivam");  
			list.add("vimal");  
			
			
		    Iterator<String> it = list.iterator();
			while(it.hasNext()){  
			System.out.println(it.next());  
			}  
			}  

	}
