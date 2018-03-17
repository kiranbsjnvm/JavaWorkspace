package com.myapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.dao.ContactDAO;
import com.myapp.dto.Address;
import com.myapp.dto.Contact;

@Controller
public class HomeController {

	@Autowired
	private ContactDAO contactDAO;
	
	@RequestMapping(value={"/","/home"})
	public ModelAndView home()
	{
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("message", "Home Page");
		
		return modelAndView;
	}
	
	@RequestMapping("/addContact")
	public ModelAndView addContact()
	{
		ModelAndView modelAndView = new ModelAndView("index");
		
		Address address = new Address();
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setPincode("560068");

		Contact contact = new Contact();
		contact.setContactName("Kiran Kumar");
		contact.setContactNumber("7795152542");
		contact.setEmail("kiranbs@gmail.com");
		contact.setAdress(address);
		
		contactDAO.add(contact);
		
		modelAndView.addObject("message", "Contact Added Sucessfully");
		
		return modelAndView;
	}
	
}
