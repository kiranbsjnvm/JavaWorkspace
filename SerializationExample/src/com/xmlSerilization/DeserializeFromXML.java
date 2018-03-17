package com.xmlSerilization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DeserializeFromXML {

	private static final String SERIALIZED_FILE_NAME="dvd.xml";
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream inputStream = new FileInputStream(SERIALIZED_FILE_NAME);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		XMLDecoder xmlDecoder = new XMLDecoder(bufferedInputStream);

		DVD dvd = (DVD)xmlDecoder.readObject();
		
		for (Movie movie : dvd.getMovies()) {
			System.out.println("Movie Name : "+movie.getName()+" ; Cast : "+movie.getCast());
		}
	}

}
