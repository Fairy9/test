package ArrayList;


import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("F");
		list.add("a");
		list.add("i");
		list.add("r");
		list.add("y");
		Iterator<String> it=list.iterator();
		while (it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}			
	}
	
	

}
