package sunny;

class multipleof3{
	int t=0;
	void sub() {
	for(int i=0; i<100; i++) {
		
		if(i%3==0) {
		t=t+i;
		}	
	}System.out.println(t); 
	}
}

public class launch5 {

	public static void main(String[] args) {
		multipleof3 mul= new multipleof3();
		mul.sub();
		
	}

}
