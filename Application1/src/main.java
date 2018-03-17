import java.util.Scanner;
import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		double num = scan.nextDouble();
		System.out.println(num);
		
		
		/*
		ClassArray obj1 = new ClassArray();
		obj1.func1();
		obj1.func2();
		obj1.func3();
		obj1.func4();
		*/
		
		
		/*
		ClassToString classObj = new ClassToString(12,8,1994);
		System.out.println(classObj);
		AnotherClass anotherObj = new AnotherClass("kiran",classObj);
		System.out.println(anotherObj);
		*/
		
		/*
		for(EnumClass ppl: EnumClass.values()){
			System.out.printf("%s\t %s\t %d\t \n",ppl,ppl.GetRel(),ppl.GetAge());
		}
		*/
		
		
		//GUI_Class.Add();
		
		/*
		GUI_Class2 guiobj = new GUI_Class2(); 
		guiobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiobj.setSize(500, 400);
		guiobj.setVisible(true);
		*/
		
		
		/*
		GUI_Class3 guiobj3 = new GUI_Class3(); 
		guiobj3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiobj3.setSize(300, 200);
		guiobj3.setVisible(true);
		*/
		
		/*
		FileClass.func1();
		FileClass.OpenFile();
		FileClass.AddData();
		FileClass.CloseFile();
		
		FileClass.OpenFile2();
		FileClass.ReadFile();
		FileClass.CloseFile2();
		*/
	}

}
