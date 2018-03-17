import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI_Class2 extends JFrame{
	
	private JLabel label1;
	private JButton btn1;
	private JButton btn2;
	private JTextField textfield;
	private JCheckBox boldCheckbox;
	private JCheckBox italicCheckbox;
	
	public GUI_Class2(){
		super("The Title bar");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("This is simple text displayig");
		label1.setToolTipText("Text on hover the label");
		add(label1);
		
		textfield = new JTextField("Simple sentence",20);
		textfield.setFont(new Font("Serif",Font.BOLD,15));
		add(textfield);
		
		//----------------------------------------
		boldCheckbox = new JCheckBox("bold");
		add(boldCheckbox);
		italicCheckbox = new JCheckBox("italic");
		add(italicCheckbox);
		
		TheItemHandler handler2 = new TheItemHandler();
		boldCheckbox.addItemListener(handler2);
		italicCheckbox.addItemListener(handler2);
		
		//----------------------------------------
		btn1 = new JButton("Click me");
		add(btn1);
		
		Icon icon1= new ImageIcon(getClass().getResource("img1.png"));
		Icon icon2= new ImageIcon(getClass().getResource("img2.png"));
		btn2 = new JButton("Custom Button",icon1);
		btn2.setRolloverIcon(icon2);
		btn2.setSize(20, 40);
		add(btn2);
		
		TheHandler handler = new TheHandler();
		btn1.addActionListener(handler);
		btn2.addActionListener(handler);
		//--------------------------------------------------------
		
	}

	private class TheHandler implements ActionListener{
		
		public void  actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, event.getActionCommand() );
		}
	}
	
	
	private class TheItemHandler implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			
			Font font = null;
			
			if(boldCheckbox.isSelected() && italicCheckbox.isSelected())
				font = new Font("Serif",Font.BOLD+Font.ITALIC,14);
			else if(boldCheckbox.isSelected())
				font = new Font("Serif",Font.BOLD,14);
			else if(italicCheckbox.isSelected())
				font = new Font("Serif",Font.ITALIC,14);
			else
				font = new Font("Serif",Font.PLAIN,14);
			
			textfield.setFont(font);
		}
	}
}
