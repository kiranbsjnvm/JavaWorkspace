package com.business;

import com.dataAccess.OrderDAO;

public class OrderBOImpl implements OrderBO{

	private OrderDAO dao;
	
	public boolean placeOrder() {
		
		return dao.placeOrder();
				
	}

	public OrderDAO getDAO() {
		return dao;
	}
	
	public void setDAO(OrderDAO dao) {
		this.dao = dao;
	}
	
	public double addPrimitiveValues(int x,float y,double z){
		return dao.addPrimitiveValues(x, y, z);
	}
}
