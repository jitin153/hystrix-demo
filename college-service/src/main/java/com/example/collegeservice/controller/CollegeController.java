package com.example.collegeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegeservice.model.StudentData;
import com.example.collegeservice.service.CollegeService;

@RestController
public class CollegeController {

	@Autowired
	private CollegeService collegeService;

	@GetMapping("/college/student/{studentId}")
	public StudentData getStudentData(@PathVariable("studentId") Integer studentId) {
		return collegeService.getStudentData(studentId);
	}
}
