package com.project.service;

import java.util.List;

import com.project.entity.Instructor;

public interface InstructorService {

	// METHOD TO GET ALL INSTRUCTOR DATA
	public List<Instructor> getInstructors();

	// METHOD TO ADD NEW INSTRUCTOR DATA
	public Instructor addInstructor(Instructor instructor);

}
