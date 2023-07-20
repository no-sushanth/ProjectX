package onetoone;

public class eatshit {

	public static void main(String[] args) {
		engine e = new engine(1200,"v12", 12000,30);
		car c = new car("Renault",2022, 20000000, "Renault", e );
		c.display();
	}

}

