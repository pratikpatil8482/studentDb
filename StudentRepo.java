package com.qsp.student_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.student_project.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>   {
	
	Student findById(int id);
	
	// Delete Student 
	
	Student deleteById(int id);

}
