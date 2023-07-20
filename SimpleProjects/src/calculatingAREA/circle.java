package calculatingAREA;

import java.util.Scanner;

public class circle extends abstraction{
	
	
	public void input()
	{
		System.out.println("Area of cicle");
		Scanner sc=new Scanner(System.in);
		System.out.println("input radius");
		radius = sc.nextFloat();
		
	}
	
	public void calculate()
	{
		this.area = 2*pi*radius;		
	}
	
	public void display()
	{
		System.out.println("Area of the circle is "+this.area);
		System.out.println();
	}
}
