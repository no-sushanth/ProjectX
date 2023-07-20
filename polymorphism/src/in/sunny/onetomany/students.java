package in.sunny.onetomany;

public class students {

	public String name;
	public String surname;
	public int rollNo;
	public int rank;
	
	public students(String name, String surname, int rollNo, int rank) {
		this.name = name;
		this.surname = surname;
		this.rollNo = rollNo;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getRank() {
		return rank;
	}
	
	
	
}
