package com.business;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyFloat;
import static org.mockito.Matchers.anyDouble;

import com.dataAccess.OrderDAO;

public class OrderBOImplTest {

	OrderBOImpl boImpl;
	
	@Mock
	OrderDAO dao;
	
	
	@Before
	public void Initialize(){
		MockitoAnnotations.initMocks(this);
		boImpl = new OrderBOImpl();
	}
	
	@Test
	public void testplaceOrderReturnsTrue()
	{
		boImpl.setDAO(dao);
		Mockito.when(dao.placeOrder()).thenReturn(true);
		
		boolean actual = boImpl.placeOrder();
		assertEquals(true, actual);
		Mockito.verify(dao).placeOrder();
	}

	@Test
	public void testaddPrimitiveValues()
	{
		double expected = 9.8;
		boImpl.setDAO(dao);
		//Mockito.when(dao.addPrimitiveValues(anyInt(), anyFloat(), anyDouble())).thenReturn(expected);
		Mockito.when(dao.addPrimitiveValues(1, 3.4f, 5.4)).thenReturn(expected);
		
		double actual = boImpl.addPrimitiveValues(1, 3.4f, 5.4);
		assertEquals(expected, actual,0);
	}
}
