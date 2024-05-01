package com.yogisoft.service;

import com.yogisoft.entity.Student;

public interface IStudentService {
	
	
	public String registerStudent(Student student);
	
	
	public Student getStudentById(Integer sid);

}
