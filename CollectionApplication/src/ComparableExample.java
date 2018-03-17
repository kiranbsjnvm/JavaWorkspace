import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample implements Comparable<ComparableExample> {
	int rollno;
	String name;
	int age;

	ComparableExample(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(ComparableExample st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}


	public static void main(String args[]) {
		
		ArrayList<ComparableExample> al = new ArrayList<ComparableExample>();
		al.add(new ComparableExample(101, "Vijay", 23));
		al.add(new ComparableExample(106, "Ajay", 27));
		al.add(new ComparableExample(105, "Jai", 21));

		Collections.sort(al);
		
		for (ComparableExample st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}