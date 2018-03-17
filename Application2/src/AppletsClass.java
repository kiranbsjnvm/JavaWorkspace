import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AppletsClass extends JApplet{

	private String name;
	
	public void init(){
		name = JOptionPane.showInputDialog("Enter you name");
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("Your name is : "+name, 40, 20);
		
	}
}
