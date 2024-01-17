package org.jsp.spring_boot_student_mock_app.controller;

import java.util.Optional;

import org.jsp.spring_boot_student_mock_app.dto.Student;
import org.jsp.spring_boot_student_mock_app.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {

	@Autowired
	private Student_Service service;
	
	@PostMapping("/student/save")
	public Student save(@RequestBody Student  student) {
		return service.save(student);
	}
	
	@GetMapping("/student/find/{id}")
	public Optional<Student> findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@GetMapping("/student/login")
	public Student login(@RequestBody Student student) {
		return service.login(student);
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@PatchMapping("/student/update/{id}")
	public Student update(@PathVariable int id,@RequestBody Student student) {
	
		return service.update(id, student);
	}
}
