package com.example.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentservice.model.Student;
import com.example.studentservice.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") Integer id) {
		return studentService.getStudent(id);
	}
}
