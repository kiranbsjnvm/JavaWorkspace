import java.io.Serializable;

public class Student implements Serializable
{
	
	public String Name;
	public int rollno;
	public String PhNo;
	
	//static field will not be serializable
	public static int marks;
	
	//transient field will not be serializable
	public transient String city;
	
	public Student(String name, int rollno, String phNo)
	{
		Name = name;
		this.rollno = rollno;
		PhNo = phNo;
	}

	
}
