import java.util.concurrent.Callable;

public class ReturnValuesFromTreads implements Callable<Integer>{

	private String str=null;
	
	public ReturnValuesFromTreads(String string)
	{
		str = string;
	}
	
	public Integer call()
	{
		System.out.println(Thread.currentThread().getName() +" : "+str);
		return doAdd();
		
	}
	
	public int doAdd()
	{
		return str.length();
	}
}
