package com.prototype;

public class Employee implements PrototypeInterfacce {

	private int id;
	private String name;
	private String designation;
	private double salary;

	public Employee() {
		System.out.println("   Employee Records of Oracle Corporation ");
		System.out.println("---------------------------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary");
	}

	public  Employee(int id, String name, String designation, double salary) {  
         
	        this.id = id;  
	        this.name = name;  
	        this.designation = designation;  
	        this.salary = salary;   
	}
	
	
	public void showRecord(){  
        
        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary);  
   }

	@Override
	public PrototypeInterfacce getClone() {
		return new Employee(id,name,designation,salary);
	}

}
