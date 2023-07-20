package polymorphism;

class animal
{
	public void eat()
	{
		System.out.println("animal eats");
	}
	
	public void sleep()
	{
		System.out.println("animal sleeps");
	}
}


class monkey extends animal
{
	public void eat() 
	{
		System.out.println("monkey eats from the plants or steals from here and there");
	}
	
	public void sleep()
	{
		System.out.println("monkeys sleep on trees or in hiding");
	}
}

class tiger extends animal
{
	public void eat()
	{
		System.out.println("tiger hunts other animals to eat");
	}
	
	public void sleep()
	{
		System.out.println("tiger sleeps in the open as there are fewer animals who threaten him");
	}
}

class deer extends animal
{
	public void eat() {
		System.out.println("deer eats plants, grass etc.");
	}
	public void sleep() {
		System.out.println("deer sleeps in hiding");
	}
}

class forest
{
	public void nature(animal a)
	{
		a.eat();
		a.sleep();
	}
	
}

public class test1 {

	public static void main(String[] args) {
		 monkey m=new monkey();
		 tiger t1=new tiger();
		 deer d= new deer();
		 
		forest f=new forest();
		f.nature(d);
		f.nature(t1);
		f.nature(m);
		
		
	  
		
		
	
	}

}
