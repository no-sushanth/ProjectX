package in.sunny.onetomany;

public class department {

	private int strength;
	private String Dname;
	private int staffSTR;
	private String floor;
	private students[] student;
	
	



	public department(String dname, int strength, int staffSTR, String floor, students[] student) {
		this.Dname = dname;
		this.strength = strength;
		this.staffSTR = staffSTR;
		this.floor = floor;
		this.student = student;
	}




	public void display() {
		System.out.println("**********Dept DEETS**********");
		System.out.println("Dept name :: "+Dname);
		System.out.println("Strength :: "+strength );
		System.out.println("Staff Strength :: "+staffSTR);
		System.out.println("floor :: "+floor);
		System.out.println("********Student DEETS*********");
		System.out.println();
		for (students students : student) {
			System.out.println("name :: "+students.name +" "+students.surname);
			//System.out.println("surname :: "+students.surname);
			System.out.println("Roll No. :: "+students.rollNo);
			System.out.println("Rank :: "+students.rank);
			System.out.println();
		}
		
		
	}
}
