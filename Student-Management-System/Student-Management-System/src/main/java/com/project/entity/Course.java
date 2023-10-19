package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "course")
public class Course {
	// ATTRIBUTES ASSOCIATED TO COURSE
	@Id
	private String courseId;
	private String title;
	private int credits;

	// Default constructor
	public Course() {
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", credits=" + credits + "]";
	}

}
