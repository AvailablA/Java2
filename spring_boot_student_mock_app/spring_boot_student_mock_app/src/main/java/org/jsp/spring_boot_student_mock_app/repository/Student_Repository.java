package org.jsp.spring_boot_student_mock_app.repository;

import java.util.Optional;

import org.jsp.spring_boot_student_mock_app.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_Repository extends JpaRepository<Student, Integer> {

	Student save(Student student);
//	Student findById(int id);
	@Query("Select s from Student s where s.email=:myemail And s.pwd=:mypwd")
	Student login(@Param(value = "myemail")String email,@Param(value = "mypwd")String pwd);
}
