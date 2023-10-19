package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.project.entity.Enrollment;


@Service
public interface EnrollmentService {
	
	
	// METHOD TO GET ALL DATA OF ENROLLMENT
	public List<Enrollment> getEnrollments();
	
	// METHOD TO ADD NEW ENROLLMENT DATA
	public Enrollment addEnrollment(Enrollment enrollment);

}
