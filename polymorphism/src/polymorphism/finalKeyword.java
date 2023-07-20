package polymorphism;

final class t1
{
	public void disp()
	{
		System.out.println("falalalala");
	}
}

/*class t2 extends t1
class wont participate in inheritance if the class is made final
methods can't be overridden if they are final methods*/
	

public class finalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 t1 t=new t1();
 t.disp();
	}

}
