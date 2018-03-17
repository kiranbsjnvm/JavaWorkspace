package com.facade;

public class IPhone implements MobileShop {

	@Override
	public void modelNo() 
	{
		System.out.println("IPhone 8");
	}
	
	
	@Override
	public void price() {
		System.out.println("Rs 72000/-");
	}

}
