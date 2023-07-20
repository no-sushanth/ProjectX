package atm;

import java.util.Scanner;



class InvalidUserException extends Exception
{
	
}


public class input
{
	
	 Scanner sc = new Scanner(System.in);
	 public int pin;
	 
	 void inputDetails() 
	 {
				  
			 System.out.println("enter the account number");
			 int acc=sc.nextInt();
			 System.out.println("Enter the pin");
			 pin=sc.nextInt();
		 
	 
	 }
	 
	 	
	 	public void verifyPIN() throws InvalidUserException 
	 	{
	 		
	 		if(pin == 1)
	 		{
	 			System.out.println("Account balance is :: 12k");
	 		}
	 		else
	 		{
	 			InvalidUserException i=new InvalidUserException();
	 			System.out.println("wrong PIN");
	 			throw i;
	 		}
	 	
	 	}
	 
	 
	 
			
			
			
			void execute()
	{
				input a = new input();
			try 
			{
				a.inputDetails();
				a.verifyPIN();
			}
			catch(InvalidUserException g)
			{
				try 
				{
					a.inputDetails();
					a.verifyPIN();
				}
				catch(InvalidUserException b)
				{
					try
					{
						a.inputDetails();
						a.verifyPIN();
					}
					catch(InvalidUserException c)
					{
						System.out.println("Your account has been blocked");
						System.exit(0);
					}
				}
			}
	 
	 }
}


