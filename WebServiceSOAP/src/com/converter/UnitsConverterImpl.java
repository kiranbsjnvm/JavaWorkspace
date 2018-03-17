package com.converter;

import javax.jws.WebService;

@WebService(endpointInterface="com.converter.UnitsConverter")
public class UnitsConverterImpl implements UnitsConverter {

	@Override
	public double celciusToFahrenheit(double celcisus) 
	{
		return celcisus * 9.0 / 5.0 + 32;
	}

	@Override
	public double fahrenheitToCelcisus(double fahrenheit) 
	{
		return (fahrenheit - 32) * 5.0 / 9.0;
	}

}
