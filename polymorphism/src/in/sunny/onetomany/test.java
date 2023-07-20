package in.sunny.onetomany;

public class test {

	public static void main(String[] args) {
		students s1 = new students("sanka", "reddy", 21, 14000);
		students s2 = new students("tikka", "reddy", 69, 69000);
		students s3 = new students("bullet", "reddy", 22, 1400);
		
		students[] student= new students[3];
		student[0] = s1;
		student[1] = s2;
		student[2] = s3;
		
		department d = new department("CSE", 240, 14, "3rd floor", student);
		d.display();
		

	}
}
