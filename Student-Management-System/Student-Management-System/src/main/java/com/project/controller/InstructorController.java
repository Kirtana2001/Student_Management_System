package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Instructor;
import com.project.service.InstructorService;

@RestController
@RequestMapping("/project/instructor")
public class InstructorController {

	@Autowired // spring boot creates object
	private InstructorService service;

	@GetMapping("/service")
	public List<Instructor> getInstructors() {
		return this.service.getInstructors();
	}

	@PostMapping("/service")
	public Instructor addInstructor(@RequestBody Instructor instructor) {
		return this.service.addInstructor(instructor);
	}
}
