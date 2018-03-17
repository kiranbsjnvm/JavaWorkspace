import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI_Class3 extends JFrame{

	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textfield3;
	private JPasswordField pwdfield;
	
	public GUI_Class3(){
		super("The Title bar");
		setLayout(new FlowLayout());
		
		textfield1 = new JTextField(10);
		add(textfield1);
		
		textfield2 = new JTextField("enter text here",20);
		add(textfield2);
		
		textfield3 = new JTextField("uneditable",20);
		textfield3.setEditable(false);
		add(textfield3);
		
		pwdfield = new JPasswordField(20);
		add(pwdfield);
		
		
		TheHandler handler =  new TheHandler();
		textfield1.addActionListener(handler);
		textfield2.addActionListener(handler);
		textfield3.addActionListener(handler);
		pwdfield.addActionListener(handler);
	}
	
	private class TheHandler implements ActionListener{
	
		String str = "";
		@Override
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == textfield1)
				str = String.format("field 1 : %s", event.getActionCommand());
			if(event.getSource() == textfield2)
				str = String.format("field 2 : %s", event.getActionCommand());
			if(event.getSource() == textfield3)
				str = String.format("field 3 : %s", event.getActionCommand());
			if(event.getSource() == pwdfield)
				str = String.format("pwd field  : %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, str);
		}
	}
}
