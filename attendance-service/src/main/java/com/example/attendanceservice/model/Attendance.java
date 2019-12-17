package com.example.attendanceservice.model;

public class Attendance {
	private Integer studentId;
	private Float attendancePercentage;

	public Attendance() {
	}

	public Attendance(Integer studentId, Float attendancePercentage) {
		this.studentId = studentId;
		this.attendancePercentage = attendancePercentage;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Float getAttendancePercentage() {
		return attendancePercentage;
	}

	public void setAttendancePercentage(Float attendancePercentage) {
		this.attendancePercentage = attendancePercentage;
	}

}
