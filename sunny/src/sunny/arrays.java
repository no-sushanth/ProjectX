
package sunny;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		int []a = new int[5];
		System.out.println("enter data");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		for(int j=0;j<5;j++)
			System.out.print(a[j]);

	}

}
