package com.project.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Dao.InstructorDao;
import com.project.entity.Instructor;
import com.project.service.InstructorService;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorDao instructorDao;

	// IMPLEMENTATION TO GET ALL INSTRUCTOR DATA
	@Override
	public List<Instructor> getInstructors() {
		return instructorDao.findAll();
	}

	// IMPLEMENTATION TO SAVE NEW INSTRUCTOR DATA
	@Override
	public Instructor addInstructor(Instructor instructor) {
		instructorDao.save(instructor);
		return instructor;
	}
}
