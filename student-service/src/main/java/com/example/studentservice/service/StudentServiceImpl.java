package com.example.studentservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.studentservice.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	private List<Student> students = Arrays.asList(new Student(1, "Aman Kumar"), new Student(2, "Vipul Chaudhary"),
			new Student(3, "Anant Singh"), new Student(4, "Madhav Mishra"));

	@Override
	public Student getStudent(Integer id) {
		Optional<Student> student = students.stream().filter(st -> st.getId() == id).findAny();
		return student.isPresent() ? student.get() : null;
	}

}
