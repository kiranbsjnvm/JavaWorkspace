package com.singleton;

public class JDBCSingleton {

	//static member holds only one instance of the JDBCSingleton class
	private static JDBCSingleton jdbcObj;
	
	//JDBCSingleton prevents the instantiation from any other class.
	private JDBCSingleton(){}
	
	
	public static JDBCSingleton getInstance() {
		if(jdbcObj==null){
			jdbcObj = new JDBCSingleton();
		}
		return jdbcObj;
	}
	
	public void printSomething() {
		System.out.println("Hey it is JDBC Singletone class");
	}
}
