
public class Main {

	public static void main(String[] args) {
		
		CircularBuffer<String> circularBuffer = new CircularBuffer<>(5);
		
		circularBuffer.add("a");
		circularBuffer.add("bc");
		circularBuffer.add("d");
		
		String value = concatinate(circularBuffer);
		System.out.println(value);
		
	}

	private static String concatinate(CircularBuffer<String> circularBuffer) 
	{
		StringBuffer stringBuffer = new StringBuffer();
		
		String value;
		while((value = circularBuffer.read()) !=null)
		{
			stringBuffer.append(value);
		}
		return stringBuffer.toString();
	}

}
