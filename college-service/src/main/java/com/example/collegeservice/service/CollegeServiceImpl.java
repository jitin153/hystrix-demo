package com.example.collegeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.collegeservice.model.Attendance;
import com.example.collegeservice.model.Student;
import com.example.collegeservice.model.StudentData;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service("collegeService")
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${student-service.url}")
	private String studentServiceUrl;

	@Value("${attendance-service.url}")
	private String attendanceServiceUrl;

	@Override
	@HystrixCommand(fallbackMethod = "studentDataFallback")
	public StudentData getStudentData(Integer studentId) {
		Student student = restTemplate.getForObject(studentServiceUrl + studentId, Student.class);
		Attendance attendance = restTemplate.getForObject(attendanceServiceUrl + studentId, Attendance.class);
		return new StudentData(studentId, student, attendance);
	}

	/*
	 * Method signature should exactly be the same. For testing purpose you can stop
	 * any one of the services(Student-Service Or Attendance-Service).
	 */
	public StudentData studentDataFallback(Integer studentId) {
		System.out.println("Fallback method executed...");
		StudentData studentData = new StudentData();
		studentData.setStudentId(studentId);
		return studentData;
	}
}
