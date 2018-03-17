
public class GenericClass {

	public static <T> void PrintMe(T[] arr){
		for(T x:arr)
			System.out.print(x+" ");
		
		System.out.println();
	}
	
	public static <T extends Comparable<T>> T Max(T a,T b,T c){
		T max = a;
		
		if(b.compareTo(a) > 0)
			max = b;
		if(c.compareTo(max) > 0)
			max = c;
		
		return max;
	}
	
}
