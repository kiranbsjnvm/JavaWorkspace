package com.singleton;

/*
 * A class that has only one instance and provides a global point of access to it.
 * 
 * To create the singleton class
 * 	- Static member: It gets memory only once
 *  - Private constructor: It will prevent to instantiate the Singleton class from outside the class.
 *  - Static factory method: This provides the global point of access to the Singleton object
 *  
 */
public class Main {

	public static void main(String[] args) {
		
		JDBCSingleton jdbcSingleton = JDBCSingleton.getInstance();
		
		jdbcSingleton.printSomething();

	}

}
