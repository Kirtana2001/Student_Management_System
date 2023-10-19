package com.project.service;

import java.util.List;

import com.project.entity.Student;

public interface StudentService {

	// METHOD TO GET ALL STUDENTS DATA
	public List<Student> getStudents();

	// METHOD TO ADD NEW STUDENTS DATA
	public Student addStudent(Student student);

	// METHOD TO GET SINGLE STUDENTS DATA BASED ON STUDENT-ID
	public Student getSingleStudent(int studentId);

	// METHOD TO UPDATE STUDENTS DATA BASED ON STUDENT-ID
	public Student updateStudent(Student student);

	// METHOD TO DELETE STUDENTS
	public void deleteStudent(int studentId);
}

