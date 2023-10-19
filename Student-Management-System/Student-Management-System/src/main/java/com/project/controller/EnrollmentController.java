package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Enrollment;
import com.project.service.EnrollmentService;

@RestController
@RequestMapping("/project/Enrollment")
public class EnrollmentController {
	
	@Autowired // spring boot creates object
	private EnrollmentService service;
	
	@GetMapping("/service")
	public List<Enrollment> getEnrollments() {
		return this.service.getEnrollments();
	}

	@PostMapping("/service")
	public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
		return this.service.addEnrollment(enrollment);
	}

}
