package com.yogisoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yogisoft.entity.Student;
import com.yogisoft.service.IStudentService;

@RestController
@RequestMapping("/student-service")
public class StudentOperationController {
	
	
	
	
	@Autowired
	private IStudentService service;
	
	
	
	@PostMapping("/registration")
	public ResponseEntity<String> resgisterStudent(@RequestBody Student student)
	{
		
		System.out.println("StudentOperationController.resgisterStudent() ---Inside Register endPoint");
		
		
		String result = service.registerStudent(student);
		
		
		return new ResponseEntity<String>(result, HttpStatus.OK);
		
		
		
	}
	
	
	@GetMapping("/getStudentById/{sid}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer sid)
	{
		
		System.out.println("StudentOperationController.getStudentById() ----Inside Find By Id");
		
		Student result = service.getStudentById(sid);
		
		
		return new ResponseEntity<Student>(result , HttpStatus.OK);
		
	}

}
