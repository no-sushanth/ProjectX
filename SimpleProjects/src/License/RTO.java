package License;

import java.util.Scanner;

class OverageException extends Exception
{
	
	OverageException(){
		super();
	}
}

class UnderageException extends Exception
{
	UnderageException(){
		super();
	}
}

class input 
{
	int age;
	
	 void inputAge() 
	{
		System.out.println("Enter the AGE of candidate");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
				
	}
	
	void checkAge() throws UnderageException, OverageException
	{
		if(age <= 17 )
		{
			throw new UnderageException();
		}
		else if(age >=61)
		{
			throw new OverageException();
		}
		else
		{
			System.out.println("Eligible for license");
		}
	}
}

class initiate extends input
{
	void init()
	{
		input i = new input();
		try
		{
		i.inputAge();
		i.checkAge();
		}
		catch(UnderageException | OverageException e)
		{
			System.out.println();
			try
			{
			i.inputAge();
			i.checkAge();
			}
			catch(UnderageException | OverageException f)
			{
				System.out.println("not eligible for license");
				try
				{
				i.inputAge();
				i.checkAge();
				}
				catch(UnderageException | OverageException g)
				{
					System.out.println("not eligible for license");
					
				}
				
			}
		}
	}
	
}

public class RTO {

	public static void main(String[] args) {
		
		initiate in= new initiate();
		in.init();
	

	}

}
