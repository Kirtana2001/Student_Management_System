package com.project.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "score")
public class Score {
	// ATTRIBUTES ASSOCIATED TO SCORE
	@Id
	private String scoreID;
	private String studentID;
	private String courseID;
	private int creditObtained;
	private LocalDate dateOfExam;
	
	// Default constructor
	public Score() {
		
	}

	public String getScoreID() {
		return scoreID;
	}

	public void setScoreID(String scoreID) {
		this.scoreID = scoreID;
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

	public int getCreditObtained() {
		return creditObtained;
	}

	public void setCreditObtained(int creditObtained) {
		this.creditObtained = creditObtained;
	}

	public LocalDate getDateOfExam() {
		return dateOfExam;
	}

	public void setDateOfExam(LocalDate dateOfExam) {
		this.dateOfExam = dateOfExam;
	}

	@Override
	public String toString() {
		return "Score [scoreID=" + scoreID + ", studentID=" + studentID + ", courseID=" + courseID + ", creditObtained="
				+ creditObtained + ", dateOfExam=" + dateOfExam + "]";
	}

	
	
	

}
