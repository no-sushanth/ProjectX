package aggregation;

public class test {

	public static void main(String[] args) {
		
		theatre theatre=new theatre("INOX", 6, "Kachiguda");
		
		movies movie1= new movies("Creed 3", 120 , 3, theatre);
		movies movie2= new movies("Transformers", 180, 2, theatre);
		movies movie3= new movies("flash", 154 , 4, theatre);
		movies movie4= new movies("Oppenheimer", 95 , 6, theatre);
		
		movie1.display();
		System.out.println();
		movie2.display();
		System.out.println();
		movie3.display();
		System.out.println();
		movie4.display();
	}
		

}
