import java.awt.BorderLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;

public class Websitee extends JApplet{

	private HashMap<String,URL> websiteInfo;
	private ArrayList<String> titles;
	private JList mainList;
	
	public void init(){
		websiteInfo = new HashMap<String,URL>();
		titles = new ArrayList<String>();	
		
		grabHtmlInfo();
		add(new JLabel("Which website you want to visit"),BorderLayout.NORTH);
		mainList = new JList(titles.toArray());
		
	}
}
