package sunny;

import java.util.Scanner;

class readthenumber
{
	int i,n=16,correctvalue, player1value, player2value, player3value;
	void read(){
		System.out.println("Give the number you wanna guess");
		Scanner sc= new Scanner(System.in);
		correctvalue = sc.nextInt();
		for(i=0;i<n;i++)
		System.out.println();
			}
	
	void player1() {
		System.out.println("Player 1 shall enter his guess");
		Scanner sc = new Scanner(System.in);
	 player1value = sc.nextInt();
	}
	
	void player2() {
		System.out.println("Player 2 shall enter his guess");
		Scanner sc = new Scanner(System.in);
		player2value = sc.nextInt();
	}
	
	void player3() {
		System.out.println("Player 3 shall enter his guess");
		Scanner sc = new Scanner(System.in);
		player3value = sc.nextInt();
		
	}
	
	void compare() {
		if(player1value==correctvalue) {
			System.out.println("player 1 has guessed correctly");
		}else if(player2value==correctvalue) {
			System.out.println("player 2 has guessed correctly");
		}else if(player3value==correctvalue) {
			System.out.println("player 3 has guessed correctly");
		}else {
			System.out.println("nobody guessed correctly");
		
			
		}
	}
}
public class guesserGame {

	public static void main(String[] args) {
		
		readthenumber x= new readthenumber();
		x.read();
		x.player1();
		x.player2();
		x.player3();
		x.compare();
		
	}

}
