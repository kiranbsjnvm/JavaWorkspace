package com.prototype;

/*
 * Cloning of an existing object instead of creating new one.
 * This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.
 * It hides complexities of creating objects.
 */

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1,"kiran","SE",60000);
		employee1.showRecord();
		
		System.out.println("\n");
		
		Employee employee2 = (Employee)employee1.getClone();
		employee2.showRecord();
		

	}

}
