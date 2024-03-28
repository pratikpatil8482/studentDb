package com.qsp.student_project.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.student_project.dao.StudentDao;
import com.qsp.student_project.dto.Student;

@RestController
public class StudentControler {
	
	@Autowired
	private StudentDao dao;

	@PostMapping("/save/student")
	public Object saveData(@RequestBody Student student) {
		return dao.saveStudent(student);
	}
	
	@GetMapping("/get/student")
	public Object getStudent(@RequestParam int id) {
		return dao.getStudent(id);
	}
	
	@DeleteMapping("/delete/student")
	public Object deleteStudent(@RequestParam int id) {
		return dao.deleteByID(id);
	}
	
	@PutMapping("/update/student")
	public Object updateStudent(@RequestBody Student student,@RequestParam int id) {
		return dao.updateById(student ,id);
	}
}
