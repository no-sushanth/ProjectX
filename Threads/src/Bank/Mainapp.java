package Bank;
 
class juhu implements Runnable{
	
	public void run() {
		Thread t= new Thread();
		try
		{
		for(int i=0; i<3; i++) {
			
			System.out.println("juhu is being implented for"+i+"st time");
			t.sleep(3000);
		}
		}
		catch(InterruptedException e) {
			System.out.println(t.getStackTrace());
		}
}
}

public class Mainapp {
						
	public static void main(String[] args) throws Exception {
		
		juhu j = new juhu();
		System.out.println("ott app launched");
		Thread.sleep(4000);
		
		Thread t1 = new Thread(j);
		System.out.println("movie xyz");
		t1.run();
		
		Thread t2 = new Thread();
		System.out.println();
		t2.sleep(4000);
		
//		t1.join();
		
		System.out.println("end");
		
			
		
		
	}

}
