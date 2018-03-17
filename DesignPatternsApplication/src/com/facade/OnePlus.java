package com.facade;

public class OnePlus implements MobileShop {

	@Override
	public void modelNo() 
	{
		System.out.println("One Plus X");
	}
	
	
	@Override
	public void price() {
		System.out.println("Rs 21000/-");
	}

}
