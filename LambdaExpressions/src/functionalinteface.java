@FunctionalInterface
interface alpha
{
	void display();
}

class beta implements alpha
{
	public void display() 
	{
		System.out.println("this is sparta");
	}
}
public class functionalinteface {

	public static void main(String[] args) {
		 alpha a = new beta();
		 a.display();

	}

}
