package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "feedback")
public class Feedback {
	// ATTRIBUTES ASSOCIATED TO FEEDBACK
	@Id
	private int feedbackId;
	private String studentId;
	private String instructorId;
	private String feedback;
	
	// Default constructor
	public Feedback() {
		
	}
	
	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", studentId=" + studentId + ", instructorId=" + instructorId
				+ ", feedback=" + feedback + "]";
	}

}
