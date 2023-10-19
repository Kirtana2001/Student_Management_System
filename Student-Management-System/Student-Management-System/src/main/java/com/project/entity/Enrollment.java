package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "enrollment")
public class Enrollment {
	// ATTRIBUTES ASSOCIATED TO ENROLLMENT
	@Id
	private String enrollmentID;
	private String studentID;
	private String courseID;
	private String instructorID;
	
	// Default constructor
	public Enrollment() {
	}

	public String getEnrollmentID() {
		return enrollmentID;
	}

	public void setEnrollmentID(String enrollmentID) {
		this.enrollmentID = enrollmentID;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(String instructorID) {
		this.instructorID = instructorID;
	}

	@Override
	public String toString() {
		return "Enrollment [enrollmentID=" + enrollmentID + ", studentID=" + studentID + ", courseID=" + courseID
				+ ", instructorID=" + instructorID + "]";
	}
}
