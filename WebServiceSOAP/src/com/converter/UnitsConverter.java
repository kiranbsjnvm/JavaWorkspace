package com.converter;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface UnitsConverter {

	@WebMethod double celciusToFahrenheit(double celcisus);
	@WebMethod double fahrenheitToCelcisus(double fahrenheit);
	
}
