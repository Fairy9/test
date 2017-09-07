package ArrayList;

public class Demo3 {
  public static void main(String[] args) throws Exception{
	  int n=0;
	  for(int i=-2;i<5;i++)
	  {
		  if(i<10)
		  {    try{
			   n=2/i;
			   System.out.println(1);
		       }catch(Exception e ){
		    	  
		    	  System.out.println(e.getMessage()); 
		    	  System.out.println("分母不能为0"+i); 
		    	  continue;
		       }
			 System.out.println(n);
			 
		  }
	  }
	
}

}
