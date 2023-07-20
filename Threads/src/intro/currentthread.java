package intro;

public class currentthread {

	public static void main(String[] args) {
	
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		t.setName("new1");
		t.setPriority(4);
		System.out.println(t);
		
	}

}
