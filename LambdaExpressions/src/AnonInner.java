interface CLS
{
	int getLength(String s);
}

public class AnonInner 
{
	public static void main(String[] args) 
	{
		CLS a= new CLS() 
		{
			public int getLength(String s) 
			{
				int res=s.length();
				return res;
					
			}
		};
		System.out.println(a.getLength("Alien"));
	}

}
