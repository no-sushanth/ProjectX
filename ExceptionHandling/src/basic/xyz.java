package basic;

import java.util.Scanner;

class arrr 
{
	Scanner sc = new Scanner(System.in);
	 public static int size;
	public void rekt() 
	{			
		
		System.out.println("enter the size of the array");
		size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("enter the value to be stored");
		int elem= sc.nextInt();
		System.out.println("enter the position at which the element must be stored");
		int pos = sc.nextInt();
		System.out.println("enter the position at which the element must be stored");
		
		arr[pos]= elem;
		
	}
}


class xyz extends arrr
{
	public static void main(String[] args) 
	{
		arrr a=new arrr();
		
		try {
		a.rekt();
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter a number between 0-"+size);
		}
	}
}
		
		
	
		
