package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Dao.EnrollmentDao;
import com.project.entity.Enrollment;
import com.project.service.EnrollmentService;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{
	
	@Autowired
	private EnrollmentDao enrollmentDao;

	// IMPLEMENTATION TO GET ALL ENROLLMENT DATA
	@Override
	public List<Enrollment> getEnrollments() {
		// TODO Auto-generated method stub
		return enrollmentDao.findAll();
	}

	// IMPLEMENTATION TO SAVE NEW ENROLLMENT DATA
	@Override
	public Enrollment addEnrollment(Enrollment enrollment) {
		enrollmentDao.save(enrollment);
		return enrollment;
	}


}
