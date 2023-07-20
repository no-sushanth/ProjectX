package sunny;


class Alien1
{
	private int age;
	private String name;
	
	static int count;
	
	Alien1()
	{
		count++;
	}
	
	Alien1(int age)
	{
		this.age=age;
		count++;
	}
	Alien1(int age, String name)
	{
		this.age=age;
		this.name=name;
		count++;
	}
}


public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien1 a1=new Alien1();
		System.out.println(Alien1.count);
		Alien1 a2=new Alien1(28);
		System.out.println(Alien1.count);
		Alien1 a3=new Alien1(28, "Rahul");
		
		System.out.println(Alien1.count);

	}

}
