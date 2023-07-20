package calculatingAREA;

import java.util.Scanner;

public class rectangle extends abstraction {
	
	public void input()
	{
		System.out.println("Area of rectangle");
		Scanner sc=new Scanner(System.in);
		System.out.println("input length");
		length = sc.nextInt();
		System.out.println("input breadth");
		breadth =sc.nextInt();
		
	}
	
	public void calculate()
	{
		this.area =length*breadth;		
	}
	
	public void display()
	{
		System.out.println("Area of the rectangle is "+(int)this.area);
		System.out.println();
	}

}
