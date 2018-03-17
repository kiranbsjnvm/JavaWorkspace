package com.xmlSerilization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerializeToXML {

	private static final String SERIALIZED_FILE_NAME="dvd.xml";
	
	public static void main(String[] args) throws IOException 
	{
		List<Movie> moviesList=new ArrayList<Movie>();
		
		Movie bourneIndentity=new Movie("The Bourne Identity",119,"Doug Liman",2002,"Matt Damon, Franka Potente");
		Movie bourneSupermacy=new Movie("The Bourne Supremacy",108,"Paul Greengrass",2004,"Matt Damon, Franka Potente, Joan Allen");
		
		moviesList.add(bourneIndentity);
		moviesList.add(bourneSupermacy);
		
		
		DVD dvd = new DVD();
		dvd.setMovies(moviesList);
		
		
		FileOutputStream fileOutputStream = new FileOutputStream(SERIALIZED_FILE_NAME);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		XMLEncoder encoder = new XMLEncoder(bufferedOutputStream);
		encoder.writeObject(dvd);
		
		encoder.close();
		bufferedOutputStream.close();
		fileOutputStream.close();
		
		
		System.out.println("XML Serilization done");
	}

}
