package com.project.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	// ATTRIBUTES ASSOCIATED TO STUDENTS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudentID")
	private int studentId;

	@Column(name = "FirstName", length = 50)
	@NotBlank(message = "First Name is required")
	private String firstName;

	@Column(name = "LastName", length = 50)
	@NotBlank(message = "Last Name is required")
	private String lastName;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd") // Specify the date format
	@NotBlank(message = "DOB is required")
	private LocalDate dob;

	@Column(name = "Gender", length = 1)
	private String gender;

	@Column(name = "Email", length = 100, unique = true)
	@Email(message = "Please enter a valid email address")
	private String email;

	@Column(name = "Phone", length = 20)
	@Pattern(regexp = "\\d{10}", message = "Please enter a 10-digit contact number")
	private long phone;

	private String role;

	@Size(min = 8, message = "Password must be at least 8 characters long")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&!])[A-Za-z\\d@#$%^&!]{8,}$", message = "Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character (@#$%^&!)")
	private String password;

	public Student(int studentId, String firstName, String lastName, LocalDate dob, String gender, String email,
			long phone, String role, String password) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.role = role;
		this.password = password;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getstudentId() {
		return studentId;
	}

	public void setstudentId(int studentId) {
		this.studentId = studentId;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
