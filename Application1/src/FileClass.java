import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileClass {

	static Formatter formatter;
	static Scanner scan;
	
	public static void func1(){
	
		File file = new File("D:\\Java_Workspace\\Application1\\Files\\file1.txt");
		
		if(file.exists()){
			System.out.println(file.getName()+" exists");
		}else{
			System.out.println(file.getName()+" not exists");
		}
	}
	
	public static void OpenFile(){
		try {
				formatter = new Formatter("D:\\Java_Workspace\\Application1\\Files\\file2.txt");
				System.out.println("file created");
			}catch (FileNotFoundException e) {
				System.out.println("Erroe while creating file");
			}
	}
	
	public static void AddData(){
		formatter.format("%s%s%s", "1. ","Kiran "," 23");
		System.out.println("Data added");
	}
	
	public static void CloseFile(){
		formatter.close();
		System.out.println("file closed");
	}
	
	
	public static void OpenFile2(){
		try {
			scan =  new Scanner(new File("D:\\Java_Workspace\\Application1\\Files\\file2.txt"));
			System.out.println("file opened");
		} catch (FileNotFoundException e) {
			System.out.println("Coudn't find file");
		}
	}
	
	public static void ReadFile(){
		
		while(scan.hasNext()){
			String s1 = scan.next();
			String s2 = scan.next();
			String s3 = scan.next();
			
			System.out.format("%s %s %s \n", s1,s2,s3);
		}
	}
	
	public static void CloseFile2(){
		scan.close();
		System.out.println("file closed");
	}
}
