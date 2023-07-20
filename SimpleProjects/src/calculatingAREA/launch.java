package calculatingAREA;

public class launch {

	public static void main(String[] args) {
		
		circle c=new circle();
		rectangle r=new rectangle();
		square s=new square();
		s.input();
		s.calculate();
		s.display();
		c.input();
		c.calculate();
		c.display();
		r.input();
		r.calculate();
		r.display();
	}

}
