package org.jsp.spring_boot_student_mock_app.service;

import java.util.Optional;

import org.jsp.spring_boot_student_mock_app.dao.Student_Dao;
import org.jsp.spring_boot_student_mock_app.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Service {

	@Autowired
	private Student_Dao dao;

	public Student save(Student student) {
		
		return dao.save(student);
	}

	public Optional<Student> findById(int id) {
		
		return dao.findById(id);
	}

	public Student login(Student student) {
		
		return dao.login(student);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	public Student update(int id,Student student) {
		return dao.update(id, student);
		
	}

	
}
