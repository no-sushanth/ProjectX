package sunny;

import java.util.Scanner;

class Farmer
{
	public static float pa;
	private float td;
	public float getPa() {
		return pa;
	}

	public void setPa(float pa) {
		this.pa = pa;
	}

	public float getTd() {
		return td;
	}

	public void setTd(float td) {
		this.td = td;
	}

	public float getSi() {
		return si;
	}

	public void setSi(float si) {
		this.si = si;
	}

	public static float getRi() {
		return ri;
	}

	public static void setRi(float ri) {
		Farmer.ri = ri;
	}

	private float si;
	private static float ri; //class variables
	
	static
	{
		ri=2.5f;
	}
	
	
	public void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Dear, Kindly enter loan amount needed");
		pa=scan.nextFloat();
		System.out.println("Dear, Kindly enter time needed to repay");
		td=scan.nextFloat();
		
	}
	
	public void compute()
	{
		si=(pa*td*ri)/100;
	}
	
	public void disp()
	{
		System.out.println("Si is " + si);
	}
	
}

public class LaunchFarmer {
	

	public static void main(String[] args) {
		
		
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		
		
		System.out.println(f1.getPa());
		f1.setPa(20);
		System.out.println(f1.pa);
		System.out.println(f2.getPa());
		f2.acceptInput();
		f2.compute();
		f2.disp();
		

	}

}
