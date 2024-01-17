package org.jsp.spring_boot_student_mock_app.dao;

import java.util.Optional;



import org.jsp.spring_boot_student_mock_app.dto.Student;
import org.jsp.spring_boot_student_mock_app.repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class Student_Dao {

	@Autowired
	private Student_Repository repository;
	
	
	public Student save(Student student) {
		return repository.save(student);
	}
	
	public Optional<Student> findById(int id) {
		return repository.findById(id);
	}
	
	public void delete(int id) {
		repository.deleteById(id);
	}

	public Student login(Student student) {
		
		return repository.login(student.getEmail(), student.getPwd());
	}
	public void deleteById(int id) {
		repository.deleteById(id);
	}
	
	public Student update(int id,Student student) {
		student.setId(id);
		return repository.save(student);
		
	}

	
	
}
