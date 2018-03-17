package com.tsaks;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.ArrayList;
import java.util.List;

public class GnericSumClass<T extends Number> {

	private List<T> list;
	
	public GnericSumClass(List<T> li)
	{
		list = li;
	}
	
	public T getSum() 
	{
		T sum;
		for (T t : list) {
			sum = t + sum;
		}
		return sum;
	}
	
	public static void main(String arg[]) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(32);
		
		GnericSumClass<Integer> obj1 = new GnericSumClass<Integer>(list1);
		System.out.println(obj1.getSum());
		
		
		
	}
}
