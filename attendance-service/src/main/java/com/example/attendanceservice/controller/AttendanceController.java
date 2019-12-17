package com.example.attendanceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.attendanceservice.model.Attendance;
import com.example.attendanceservice.service.AttendanceService;

@RestController
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;

	@GetMapping("/attendance/{studentId}")
	public Attendance getAttendance(@PathVariable("studentId") Integer studentId) {
		return attendanceService.getAttendance(studentId);
	}
}
