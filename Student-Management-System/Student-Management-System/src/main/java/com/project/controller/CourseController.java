package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Course;
import com.project.service.CourseService;

@RestController
@RequestMapping("/project/course")
public class CourseController {

	@Autowired // spring boot creates object
	private CourseService service;

	@GetMapping("/service")
	public List<Course> getCourses() {
		return this.service.getCourses();
	}

	@PostMapping("/service")
	public Course addCourse(@RequestBody Course course) {
		return this.service.addCourse(course);
	}

}
