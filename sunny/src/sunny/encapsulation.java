   package sunny;
   
   class Alien
   	{
	   private int age;
	   private String name;
	  
	   public void setAge(int x)
	   {
		   if(x>0) {
		   age=x;
		   }
		   else {
			   System.out.println("input is wrong");
		   }
	   }
	   
	   public void setName(String x)
	   {
		   name=x;
	   }
	   
	   public int getAge()
	   {
		   return age;
	   }
	   
	   
	   public String getName()
	   {
		   return name;
	   }
	
   }

public class encapsulation {

	public static void main(String[] args) {
		Alien a= new Alien();
		//a.age=-10;
		a.setAge(-10); //age cant be negetive
		a.setName("sunny");
		System.out.println(a.getAge());
		System.out.println(a.getName());
		
		
		
	}

}
