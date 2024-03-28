package com.qsp.student_project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.student_project.dto.Student;
import com.qsp.student_project.repo.StudentRepo;

@Repository
public class StudentDao {
	
	@Autowired
	private StudentRepo repo;
	
	public Object saveStudent(Student student) {
		return repo.save(student);
	}

	
	public Object getStudent(int id) {
		return repo.findById(id);
	}
	
	public Object deleteByID(int id) {
		Student student=repo.findById(id);
		
		if(student!=null) {
			 repo.deleteById(id);
			 return "Delete Success";
		}else {
			return "Delete Unsucces";
		}
		
	}


	public Object updateById(Student student, int id) {
		
		Student studentDb=repo.findById(id);
		if(studentDb!=null) {
			student.setStudentId(studentDb.getStudentId());
			repo.save(student);
			return "Update Success";
		}else {
			return "Student Not In DataBase";
		}
	}
	
}
