package sunny;

 class calculator{
	public int add(int a, int b)
	{
		int result= a+b;
		return result;
	}
}

public class addMethod {

	public static void main(String[] args) {
		
		int a=5;
		int b= 6;
		
		calculator calc = new calculator();
		
		int result = calc.add(a,b);
		System.out.println(result);
	}

}
