package com.CustomValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	public void initialize(IsValidHobby isValidHobby) 
	{
		
	}
	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext arg1) 
	{
		if(hobby==null)
			return false;
		if(hobby.toUpperCase().matches("MUSIC|CRICKET|SWIMMING|CRICKET"))
			return true;
		else
			return false;
	}

	
}
