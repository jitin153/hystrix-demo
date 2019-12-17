package com.example.collegeservice.model;

public class StudentData {
	private Integer studentId;
	private Student student;
	private Attendance attendance;

	public StudentData() {

	}

	public StudentData(Integer studentId, Student student, Attendance attendance) {
		this.studentId = studentId;
		this.student = student;
		this.attendance = attendance;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Attendance getAttendance() {
		return attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}

}
