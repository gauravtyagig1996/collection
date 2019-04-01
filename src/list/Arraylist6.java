package list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Arraylist6 {
	//arraylist serilization
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ravi");
		list.add("shivam");
		list.add("gaurav");
		
		try{
			//serialization
			FileOutputStream fos=new FileOutputStream("C:/Users/dell/Desktop/Hello.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			fos.close();
			oos.close();
			
			//deserilization
			FileInputStream fis=new FileInputStream("C:/Users/dell/Desktop/Hello.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList list1=(ArrayList)ois.readObject();
			System.out.println(list);
			}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
