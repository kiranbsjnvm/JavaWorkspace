
public class ThreadPool implements Runnable{

	public String msg;
	
	public ThreadPool(String str){
		msg = str;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" (strat) message = "+msg);
		SleepForSometime();
		System.out.println(Thread.currentThread().getName()+" (end) message = "+msg);
	}

	private void SleepForSometime() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
