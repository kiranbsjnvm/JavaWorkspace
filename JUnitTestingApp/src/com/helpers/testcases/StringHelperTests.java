package com.helpers.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.helpers.StringHelper;

public class StringHelperTests {

	static StringHelper helper;
	
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");
        
        helper = new StringHelper();
    }  
	
	@Before  
    public void setUp() throws Exception {  
        System.out.println("before each method"); 
    }
	
	@Test
	public void testRemoveAInFirst2Positions() 
	{
		String expected = "BCD";
		
		String actual = helper.removeAInFirst2Positions("ABCD");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveAInFirst2Positions2() 
	{
		
		String expected = "BCD";
		
		String actual = helper.removeAInFirst2Positions("ABCD");
		assertEquals(expected, actual);
	}
	
	@After  
    public void tearDown() throws Exception {  
        System.out.println("after each method");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  

}
