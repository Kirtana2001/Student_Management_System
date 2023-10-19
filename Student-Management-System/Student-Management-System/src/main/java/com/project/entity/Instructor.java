package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor {
	// ATTRIBUTES ASSOCIATED TO INSTRUCTOR
	@Id
	private String instructorId;
	private String firstName;
	private String lastName;
	private String emailId;

	// Default constructor
	public Instructor() {
	}

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstrutorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + "]";
	}

}
