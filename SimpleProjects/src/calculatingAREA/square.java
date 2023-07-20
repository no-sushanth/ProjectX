package calculatingAREA;

import java.util.Scanner;

public class square extends abstraction {
	
	public void input()
	{
		System.out.println("Area of square");
		Scanner sc=new Scanner(System.in);
		System.out.println("input length");
		length = sc.nextInt();
		
		
	}
	
	public void calculate()
	{
		this.area =length*length;		
	}
	
	public void display()
	{
		System.out.println("Area of the square is "+(int)this.area);
		System.out.println();
	}
}
