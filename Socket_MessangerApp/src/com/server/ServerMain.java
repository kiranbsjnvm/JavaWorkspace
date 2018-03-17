package com.server;

import javax.swing.JFrame;

public class ServerMain {

	public static void main(String[] args) {
		
		Server serverObj = new Server();
		serverObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		serverObj.startRunning();
	}

}
