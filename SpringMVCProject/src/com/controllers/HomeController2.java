package com.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Home")
public class HomeController2 {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "This is Annotation based controller msg");
		
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView showUserDetail(@PathVariable("countryName") String country,@PathVariable("userName") String name){
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "Hello "+name+", You are from "+country);
		
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{countryName}/{userName}/{age}")
	public ModelAndView showUserDetails(@PathVariable Map<String,String> pathVariables){
		
		String name = pathVariables.get("userName");
		String country = pathVariables.get("countryName");
		String age = pathVariables.get("age");
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "Hello "+name+", You are from "+country+". Your age is "+age);
		
		return modelAndView;
	}
}
