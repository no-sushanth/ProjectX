package euler;


class add{
	public int t=0;
	void add1() {
	for(int i=0;i<1000;i++) {
		 if(i%3==0 || i%5==0) {
			
			 t=t+i;
		 }
	}
	System.out.println(t);
}
}
public class multiplesOf3 {
 public static void main(String[] args) {
	 add n=new add();
	 n.add1();
	 
  	}
}
