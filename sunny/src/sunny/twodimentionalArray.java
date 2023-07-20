package sunny;

import java.util.Scanner;

public class twodimentionalArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][]a = new int[3][];
		a[0]= new int[4];
		a[1]= new int[7];
		a[2]= new int[2];
		for(int i=0;i<a.length; i++ ) {
			System.out.println("Enter the marks of class " + (i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("student "+(j+1));
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Marks are as follows");
		for(int i=0;i<a.length; i++ ) {
			System.out.println("Marks of class " + (i+1) +" students are:");
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
				
			}
			System.out.println();
		}
	}

}
