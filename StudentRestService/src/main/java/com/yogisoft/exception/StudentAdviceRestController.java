package com.yogisoft.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.yogisoft.helper.StudentErrorDetails;

@RestControllerAdvice
public class StudentAdviceRestController {
	
	
	
	@ExceptionHandler(value = StudentNotFoundException.class)
	public ResponseEntity<StudentErrorDetails> studentNotFound(StudentNotFoundException snfe)
	{
		
		
		StudentErrorDetails result = new StudentErrorDetails();
		
		
		
		result.setDatetimedetails(LocalDateTime.now());
		
		result.setMsg("Student Not Found this id::");
		
		result.setStatusCode(400);
		
		
		
		return new ResponseEntity<StudentErrorDetails>(result,HttpStatus.OK);
		
		
		
		
	}
	

}
