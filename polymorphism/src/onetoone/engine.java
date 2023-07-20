package onetoone;

public class engine {

	private int horsepower;
	private String ename;
	private int rpm;
	private int milage;
	
	public engine(int horsepower, String ename, int rpm, int milage) {
		
		this.horsepower = horsepower;
		this.ename = ename;
		this.rpm = rpm;
		this.milage = milage;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public String getEname() {
		return ename;
	}

	public int getRpm() {
		return rpm;
	}

	public int getMilage() {
		return milage;
	}
	

}
