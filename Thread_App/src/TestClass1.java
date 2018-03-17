
public class TestClass1 extends Thread{

	public void run(){
		//System.out.println("Running 1...");
		
		for(int i=0;i<5;i++){
			try {
				System.out.println(Thread.currentThread().getName()+" : "+ i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
