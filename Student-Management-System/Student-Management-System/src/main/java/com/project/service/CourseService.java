package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.Course;

@Service
public interface CourseService {

	// METHOD TO GET ALL COURSE DATA
	public List<Course> getCourses();

	// METHOD TO ADD NEW COURSE DATA
	public Course addCourse(Course course);

}
