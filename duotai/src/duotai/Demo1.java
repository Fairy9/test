package duotai;

import java.util.ArrayList;

public class Demo1 {
         @SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) {
        	 
			/*ArrayList apples=new ArrayList();
			for(int i=0;i<3;i++)
			{
				apples.add(new Apples());
			}
        	
        	apples.add(new Orange());
        	for(int i=0;i<apples.size();i++)
        	{
        		System.out.println(((Apples) apples.get(i)).id());
        	}*/
			Person son=new Son();
			
        	
		}
}
class Apples{
	private static long counter;
	private final long id=counter++;
	public long id()
	{
		return id;
	}
}
class Orange{
	
}
class Person{
	void eat()
	{
		System.out.println("吃饭");
	}
}
class Son extends Person{
	void eat()
	{
		System.out.println("按时吃饭");
		
	}
	void sing()
	{
		System.out.println("唱歌");
	}
}