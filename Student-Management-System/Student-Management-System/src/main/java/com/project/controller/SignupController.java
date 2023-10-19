package com.project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model; // Import Model
import com.project.entity.Student;
import com.project.repository.StudentRepository;

@Controller
public class SignupController {

	@Autowired
	private StudentRepository studentRepository;

	// Handler for home page
	@GetMapping("/home")
	public String homePage() {
		return "home";
	}

	// Handler for login page
	@GetMapping("/login")
	public String loginPage(Student student) {
		return "login";
	}

	// Handler for the login process
	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password) {
		Student dbStudent = studentRepository.findByEmail(email);
		if (dbStudent != null && password.equals(dbStudent.getPassword())) {
			if ("ADMIN".equals(dbStudent.getRole())) {
				return "adminpage";
			} else {
				return "home_page"; // Redirect to the home page after successful login
			}
		} else {
			return "error";
		}
	}

	@GetMapping("/signup")
	public String signupPage(Model model) {
		model.addAttribute("student", new Student());
		return "signup";
	}

	@PostMapping("/signupprocess")
	public String signup(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "signup";
		}
		try {
			student.setRole("USER");
			studentRepository.save(student);
			return "redirect:/login"; // Redirect to the login page after successful signup
		} catch (DataIntegrityViolationException e) {
			bindingResult.rejectValue("email", "error.student",
					"Email already exists. Please choose a different email.");
			return "signup";
		}
	}
}
