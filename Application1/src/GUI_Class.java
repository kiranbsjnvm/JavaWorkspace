import javax.swing.JOptionPane;

public class GUI_Class {

	public static void Add(){
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter Second number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1+num2;
		
		JOptionPane.showMessageDialog(null, "The Sum is "+sum,"Title",JOptionPane.PLAIN_MESSAGE);
	}
}
