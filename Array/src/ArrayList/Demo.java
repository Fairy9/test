package ArrayList;

import org.junit.Test;

public class Demo {
	public static void main(String[] args) {
		Person p = new Child();
		
	}
}
abstract class Person {
     public abstract void eat1();
}

class Child extends Person {
	  @Test
       public void eat() {
      System.out.println("吃");
}

	@Override
	public void eat1() {
	 
		
	}
} 