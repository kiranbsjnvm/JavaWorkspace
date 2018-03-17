package com.server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Server extends JFrame{

	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	public Server() {
		super("Instant Messanger");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						sendMessage(e.getActionCommand());
						userText.setText("");
					}
				}
				
		);
		add(userText,BorderLayout.NORTH);
		
		chatWindow = new JTextArea();
		chatWindow.setEditable(false);
		chatWindow.setForeground(Color.ORANGE);
		add(new JScrollPane(chatWindow));
		
		setSize(300,800);
		setVisible(true);
	}
	
	
	public void startRunning(){
		try{
			server = new ServerSocket(6789,100);
			
			while (true) {
				try {
					waitForConnection();
					setUpStream();
					whileChatting();
				} catch (EOFException eofException) {
					showMessage("\n Server Ended Connection !...");
				}finally {
					closeCrap();
				}
			}
			
		}catch(IOException exception){
			exception.printStackTrace();
		}
	}
	
	private void waitForConnection() throws IOException
	{
		showMessage(" Waiting for someone to connect ......\n");
		connection = server.accept();
		showMessage(" Conected to : "+connection.getInetAddress().getHostAddress());
	}
	
	private void setUpStream() throws IOException
	{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are now setup \n");
	}
	
	private void whileChatting() throws IOException 
	{
		String message = "You are now connected. \n";
		sendMessage(message);
		ableToType(true);
		
		do{
			try{
				message = (String)input.readObject();
				showMessage(message+"\n");
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("What are you sending ????? \n");
			}
		}while(!message.equals("CLIENT - END"));
	}
	
	private void sendMessage(String message)
	{
		try {
			output.writeObject("SERVER - "+message);
			output.flush();
			showMessage("\nSERVER - "+message);
		} catch (Exception e) {
			chatWindow.append("SERVER - ERROR : Cann't send your message\n");
		}
	}
	
	private void showMessage(String msg)
	{
		//This updates chat window without refreshing entire GUI
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						chatWindow.append(msg);
					}
				}
		);
		
	}
	
	private void ableToType(boolean tof)
	{
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						userText.setEditable(tof);
					}
				}
		);
	}
	
	
	private void closeCrap()
	{
		showMessage(" Closing all connections !!...\n");
		ableToType(false);
		try {
			input.close();
			output.close();
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
