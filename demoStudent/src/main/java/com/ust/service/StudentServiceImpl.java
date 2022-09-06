package com.ust.service;

import java.util.List; 
import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service; 

import com.ust.model.Student;
import com.ust.repo.StudentRepository;
//import com.ust.service.IStudentService; 

@Service 
@Component
public class StudentServiceImpl implements IStudentService 
{ 
	@Autowired 
	private StudentRepository re; //HAS-A 

	@Override 
	public Integer saveStudent(Student s) { 
		return re.save(s).getStdId(); 
	} 
	@Override 
	public List<Student> getAllStudents() {  	 		
		return re.findAll(); 
	} 

	@Override 
	public Optional<Student> getOneStudent(Integer id) { 
		return re.findById(id); 
	} 

	@Override 
	public void deleteStudent(Integer id) {  	 				
		re.deleteById(id); 
	} 

	@Override 
	public boolean isExist(Integer id) {  	
		return re.existsById(id); 
	}

} 
