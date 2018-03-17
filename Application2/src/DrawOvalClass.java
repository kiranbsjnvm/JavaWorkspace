import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawOvalClass extends JPanel{

	private int D = 10;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.fillOval(10, 10, D, D);
	}
	
	public void SetD(int newD){
		D = newD >= 0 ? newD:10;
		repaint();
	}
	
	public Dimension getPrefferedSize(){
		return new Dimension(200,200);
	}
	
	public Dimension getMinimumSize(){
		return getPrefferedSize();
	}
}


