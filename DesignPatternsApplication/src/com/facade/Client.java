package com.facade;

import java.util.Scanner;

/*
 * Provides a unified and simplified interface to a set of interfaces in a subsystem, 
 * therefore it hides the complexities of the subsystem from the client
 * 
 * 	- It shields the clients from the complexities of the sub-system components.
 * 	- It promotes loose coupling between subsystems and its clients.
 * 
 * 	The facade pattern is used when you want to hide an implementation 
 * 	Factory pattern is used when you want to hide the details on constructing instances.
 */
public class Client {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ShopkeeperFacade facade = new ShopkeeperFacade();
		
		System.out.println("Chose your Sale : 1.IPhone  2.Samsung  3.OnePlus");
		int n = scanner.nextInt();
		
		switch (n) {
		case 1:
			facade.iphoneSale();
			break;
		case 2:
			facade.samsungSale();
			break;
		case 3:
			facade.oneplusSale();
			break;

		default:
			break;
		}
		
	}

}
