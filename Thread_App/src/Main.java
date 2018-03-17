import java.beans.FeatureDescriptor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		
		
		/*TestClass1 T1 = new TestClass1();
		TestClass1 T2 = new TestClass1();
		
		T1.setName("Thread 1");
		T2.setName("Thread 2");
		
		T2.setPriority(Thread.MAX_PRIORITY);
		
		T1.start();
		T2.start();
		
		for(int i=0;i<5;i++){
			System.out.println("Main : "+i);
		}*/
		
		
		/*TestClass2 T2 = new TestClass2();
		Thread tr1 = new Thread(T2);
		tr1.start();*/
		
		/*
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=1;i<=10;i++){
			Runnable obj = new ThreadPool(""+i);
			executor.execute(obj);
		}
		
		executor.shutdown();
		while (!executor.isTerminated()) {   }  
		 
		System.out.println("Finished all threads"); */ 
		
		
		
		//****************** Thread Group example ********************
		
		/*ThreadGroupClass obj = new ThreadGroupClass();
		
		ThreadGroup group = new ThreadGroup("MyGroup");
		Thread T1 = new Thread(group,obj,"Thread1");
		T1.start();
		Thread T2 = new Thread(group,obj,"Thread2");
		T2.start();
		Thread T3 = new Thread(group,obj,"Thread3");
		T3.start();
		
		System.out.println("Thread Group Name: "+group.getName()); 
		System.out.println("No of Threads in Group: "+group.activeCount()); 
		group.list();*/ 
		
		
		
		
		//*********** Returning result from Threads *******************
		String[] strings = new String[]{"kiran","dfgfdf","manaha","sdfsdf","rerwre","dfsdfsf"};
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Future<Integer>[] results = new Future[strings.length];  //to hold the results returned from threads
		
		int i=0;
		for (String string : strings) {
			ReturnValuesFromTreads ob = new ReturnValuesFromTreads(string);
			results[i++] = executorService.submit(ob);
		}
		
		for (Future<Integer> future : results) {
			try {
				int value = future.get();
				System.out.println(value);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}

}
