
public class ClassToString {

	private int day,month,year;
	
	public ClassToString(int d, int m,int y){
		day = d;
		month = m;
		year = y;
		
		//System.out.printf("The constructor for this is : ",this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", day,month,year);
	}
}


class AnotherClass{
	private String name;
	private ClassToString classObj;
	
	public AnotherClass(String s,ClassToString obj){
		name = s;
		classObj = obj;
	}
	
	public String toString(){
		return String.format("My name is : %s , and Birthday is : %s", name,classObj);
	}

}
