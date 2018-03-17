package com.api;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Modals.Student2;

@RestController
public class StudentRestAPIController 
{

		//*************** Get all student data  ******************
			
		//@ResponseBody  //this is not required if we are using @RestController instead of @Controller 
		//produces=MediaType.APPLICATION_XML_VALUE - tells server to send only xml formatresponce
		@RequestMapping(value="/students",method=RequestMethod.GET,produces=MediaType.APPLICATION_XML_VALUE)
		public ArrayList<Student2> getStudentList()
		{
			ArrayList<Student2> students = new ArrayList<Student2>();
			
			Student2 std1 = new Student2();
			std1.setStudentName("Kiran");
			
			Student2 std2 = new Student2();
			std2.setStudentName("Manju");
			
			Student2 std3 = new Student2();
			std3.setStudentName("Roopesh");
			
			students.add(std1);
			students.add(std2);
			students.add(std3);
			
			return students;
		}
			
		//***************** Get student data **************
		
		//@ResponseBody  //this is not required if we are using @RestController instead of @Controller
		@RequestMapping(value="/students/{name}",method=RequestMethod.GET)
		public Student2 getStudent(@PathVariable("name") String studentName)
		{
			Student2 student = new Student2();
			student.setStudentName(studentName);
			student.setStudentHobby("cricket");
			return student;
		}
		
		
		//***************** Update student data **************
		
		@RequestMapping(value="/students/{name}",method=RequestMethod.PUT)
		public boolean updateStudent(@PathVariable("name") String studentName,@RequestBody Student2 student)
		{
			System.out.println("Studennt name : "+studentName);
			System.out.println("Student name : "+student.getStudentName()+"; Student Hobby : "+student.getStudentHobby());
			
			//get the student record with the sent name from DB
			//Update the record with the given student record
			
			return true;
		}
}
