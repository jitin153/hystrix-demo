package com.example.attendanceservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.attendanceservice.model.Attendance;

@Service("attendanceService")
public class AttendanceServiceImpl implements AttendanceService {

	private List<Attendance> attedanceList = Arrays.asList(new Attendance(1, 76.0f), new Attendance(2, 81.5f),
			new Attendance(3, 71.3f), new Attendance(4, 80.2f));

	@Override
	public Attendance getAttendance(Integer studentId) {
		Optional<Attendance> result = attedanceList.stream().filter(att -> att.getStudentId() == studentId).findAny();
		return result.isPresent() ? result.get() : null;
	}

}
