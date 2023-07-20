package onetoone;

public class car {
 
	private String name;
	private int mfdyear;
	private int cost;
	private String cname;
	
	//injecting engine class HAS-A
	private engine e;
	
	public car(String name, int mfdyear, int cost, String cname,
			engine e) {
		
		this.name = name;
		this.mfdyear = mfdyear;
		this.cost = cost;
		this.cname = cname;
		this.e = e;
	}


	public void display() 
	{
		System.out.println("Name of the car :: "+name);
		System.out.println("Company name :: "+cname);
		System.out.println("Manufacturing Year :: "+mfdyear);
		System.out.println("Cost :: "+cost);
		
		System.out.println("*********ENGINE DEETS**********");
		System.out.println("Horsepower :: "+e.getHorsepower());
		System.out.println("engine type ::"+e.getEname());
		System.out.println("RPM ::"+e.getRpm());
		System.out.println("Milage :: "+e.getMilage());
		
		
	}
}