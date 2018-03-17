package com.myapp.dao;

import com.myapp.dto.Contact;

public interface ContactDAO {
	
	boolean add(Contact contact);
	
	Contact get(int id);
}
