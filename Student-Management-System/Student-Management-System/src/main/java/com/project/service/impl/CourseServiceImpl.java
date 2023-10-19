package com.project.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Dao.CourseDao;
import com.project.entity.Course;
import com.project.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	// IMPLEMENTATION TO GET ALL COURSE DATA
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	// IMPLEMENTATION TO SAVE NEW COURSE DATA
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
}
