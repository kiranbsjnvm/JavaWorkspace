package com.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Client extends JFrame{

	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String ServerIp = "";
	private Socket connection;
	
	public Client(String host)
	{
		super("Client Side");
		ServerIp = host;
		
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
		chatWindow.setForeground(Color.BLUE);
		add(new JScrollPane(chatWindow));
		
		setSize(300,800);
		setVisible(true);
	}
	
	public void startRunning() 
	{
		try {
			connectToServer();
			setUpStream();
			whileChatting();
		} catch (EOFException e) {
			showMessage("\n Client Terminated Connection");
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			closeCrap();
		}
	}
	
	private void connectToServer() throws IOException
	{
		showMessage("\n Attempting to connect to server");
		connection = new Socket(InetAddress.getByName(ServerIp), 6789);
		showMessage("\n Connected to Server : "+connection.getInetAddress().getHostAddress());
	}
	
	private void setUpStream() throws IOException
	{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Client Streams are now setup \n");
	}
	
	private void whileChatting() throws IOException 
	{
		ableToType(true);
		do{
			try{
				message = (String)input.readObject();
				showMessage(message+"\n");
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("\nWhat are you sending ????? \n");
			}
		}while(!message.equals("SERVER - END"));
	}
	
	private void sendMessage(String message)
	{
		try {
			output.writeObject("CLIENT - "+message);
			output.flush();
			showMessage("\nCLIENT - "+message);
		} catch (Exception e) {
			chatWindow.append("\nCLIENT - ERROR : Cann't send your message\n");
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
		showMessage("\n Closing all connections !!...\n");
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
