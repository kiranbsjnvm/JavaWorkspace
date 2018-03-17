package com.test;

import java.lang.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Simple
{
	 private void message()
	 {
		 System.out.println("hello java"); 
	 } 
}  

class Main1{
	
  void printName(Object obj){  
  
	  Class c=obj.getClass();    
	  System.out.println(c.getName());  
	  System.out.println("Is interface :"+c.isInterface());
	  System.out.println("Is Array :"+c.isArray());
	  System.out.println("Is Local class :"+c.isLocalClass());
	  System.out.println("Is Primitive :"+c.isPrimitive());
	  
	  
	  
  }  
  
  public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{  
   Simple s=new Simple();  
   
   Main1 t=new Main1();  
   t.printName(s); 
   
   Class c = Class.forName("Simple");
   Object object = c.newInstance();
   Method m =c.getDeclaredMethod("message", null); 
   
   m.setAccessible(true);
   m.invoke(object, null);
   
 }  
  
}  