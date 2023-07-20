package sunny;

import java.util.Scanner;

public class GuesserSravan {

	public static void main(String[] args) {
	
		int number, guess;
		int repeat;
		
		do{
		System.out.println("Enter the number to be guessed");
		
		Scanner scan= new Scanner(System.in);
		number=scan.nextInt();
		
		for(int x=0;x<15;x++)
			System.out.println();
		
		System.out.println("Enter the guess");
		guess=scan.nextInt();
		
		for(int i=0;i<100;i++) {
		if(guess<number) {
			System.out.println("guess is too low, enter a higher value");
			guess=scan.nextInt();
		}
		else if(guess>number) {
			System.out.println("guess is too high, enter a lower number");
			guess=scan.nextInt();
		}
		else {
			System.out.println("correct guess");
			break;
			
		}
		
		}
		System.out.println("Do you want to try agian? Yes=1 or No=0");
		repeat=scan.nextInt();
		}while(repeat==1);
		System.out.println("Roger that");	
		}
		
}


		
	
