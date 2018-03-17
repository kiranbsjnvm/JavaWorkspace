package com.factorymethod;

import java.util.Scanner;

/*
 * Says that just define an interface or abstract class for creating an object,
 *  but let the subclasses decide which class to instantiate.
 * 
 * 
 * - It promotes the loose-coupling
 * - allows the sub-classes to choose the type of objects to create.
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.print("Enter the name of plan for which the bill will be generated: (DOMESTICPLAN / COMMERCIALPLAN / INSTITUTIONALPLAN)");
		String planType = scanner.next();
		
		System.out.print("Enter the number of units for bill will be calculated: ");  
	    int units = scanner.nextInt();
	
	    
	    Plan plan = planFactory.getPlan(planType);
	    System.out.print("Bill amount for "+planType+" of  "+units+" units is: ");
	    plan.getRate();
	    plan.calculateBill(units);
	    
	}

}
