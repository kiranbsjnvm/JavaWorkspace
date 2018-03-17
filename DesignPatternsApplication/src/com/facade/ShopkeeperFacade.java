package com.facade;

public class ShopkeeperFacade {

	public MobileShop iphone;
	public MobileShop samsung;
	public MobileShop oneplus;

	public ShopkeeperFacade() {
		iphone = new IPhone();
		samsung = new Sumsung();
		oneplus = new OnePlus();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void oneplusSale() {
		oneplus.modelNo();
		oneplus.price();
	}
}
