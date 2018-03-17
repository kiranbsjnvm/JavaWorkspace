package com.client;

import javax.swing.JFrame;

public class ClientMain {

	public static void main(String[] args) {
	
		Client clientObj = new Client("127.0.0.1");
		clientObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clientObj.startRunning();
	}
	
}
