package com.yogisoft.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogisoft.entity.Student;
import com.yogisoft.exception.StudentNotFoundException;
import com.yogisoft.repo.IStudentRepo;
import com.yogisoft.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
    
	
	@Autowired
	private IStudentRepo repo;
	
	@Override
	public String registerStudent(Student student) {
	     
		
		return "Student Registerd Succesfully with id::"+repo.save(student).getSid();
	}

	@Override
	public Student getStudentById(Integer sid) {
		
		
		System.out.println("StudentServiceImpl.getStudentById()----Inside Find By Id Service Impl");
		
		return  repo.findById(sid).orElseThrow(()->new StudentNotFoundException());
		 
	}

}
