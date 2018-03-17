package com.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Modals.Student;
import com.Modals.Student2;

@Controller
public class StudentAdmissionController {
	
		@RequestMapping("/")
		//@RequestMapping(value="/admissionForm.html",method = RequestMethod.GET)
		public ModelAndView getAdmissionForm() throws IOException{
			
			//String error = "NULL_Pointer_Exception";
			String error = "No Exception";
			if(error.equalsIgnoreCase("null_pointer_exception")){
				throw new NullPointerException("Null Pointer Exce");
			}else if(error.equalsIgnoreCase("exception")){
				throw new IOException("unknown");
			}
			
			ModelAndView modelAndView = new ModelAndView("AdmissionForm");
			return modelAndView;
		}
		
		//This method will be called for all Request mapping method. It prints headerMsg data in all pages of this controller
		//@ModelAttribute
		//public void addingCommonObject(Model model){
		//	model.addAttribute("headerMsg", "NTIK Surathkal, India");
		//}
		
		//eg for using @ModelAttribute annotation
		@RequestMapping(value="/submitAdmissionForm.html",method = RequestMethod.POST)
		public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("studentData") Student studentData,BindingResult result){
			
			if(result.hasErrors()){
				ModelAndView modelAndView = new ModelAndView("AdmissionForm");
				return modelAndView;
			}
			
			ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
			modelAndView.addObject("headerMsg", "NTIK Surathkal, India");
			return modelAndView;
		}
	
		
		//we can avoid mupltiple @RequestParam annotation by using '@RequestParam Map<string,string> paramValues'
		/*@RequestMapping("/submitAdmissionForm.html")
		public ModelAndView submitAdmissionForm(@RequestParam(value="userName",defaultValue="defaultNAme") String name,@RequestParam("userHobby") String hobby){
			
			ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
			
			//modelAndView.addObject("msg", "Details submitted are : Name-"+name+", Hobby-"+hobby);
			
			//Adding data in Student object
			Student student = new Student();
			student.setUserName(name);
			student.setUserHobby(hobby);
			
			modelAndView.addObject("headerMsg", "NTIK Surathkal, India");
			modelAndView.addObject("studentData", student);
			
			return modelAndView;
		}*/
		
		
}

