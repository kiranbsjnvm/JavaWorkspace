package com.helpers;

public class StringHelper {

	//eg: ABCD=>BCD, BHD=>BHD, AAAA=>AA
	public String removeAInFirst2Positions(String str)
	{
		if(str.length()<=2)
			return str.replace("A", "");
		
		String firstTwoChars = str.substring(0, 2);
		firstTwoChars = firstTwoChars.replace("A","");
		String minusOfFirst2Chars = str.substring(2);
		
		return firstTwoChars+minusOfFirst2Chars;
	}
	
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}
}
