import java.io.*;

public class MainClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Student student =  new Student("kiran", 36, "8888888");
		
		//*********** Serialization *****************
		FileOutputStream fileOutputStream = new FileOutputStream("file1.ser");
		ObjectOutputStream streamWriter = new ObjectOutputStream(fileOutputStream);
		streamWriter.writeObject(student);
		fileOutputStream.close();
		streamWriter.close();
		
		FileOutputStream fileOutputStream2 = new FileOutputStream("file1.xml");
		ObjectOutputStream streamWriter2 = new ObjectOutputStream(fileOutputStream2);
		streamWriter2.writeObject(student);
		fileOutputStream2.close();
		streamWriter2.close();
		
		
		// ******************** Deserialization ******************
		FileInputStream fileInputStream = new FileInputStream("file1.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Student student2 = (Student)inputStream.readObject();
		System.out.println("Name:"+student2.Name+"; RollNo:"+student2.rollno);
		
	}

}
 