package com.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Student;
import com.project.service.StudentService;

@RestController
@RequestMapping("/project/student")
public class StudentController {

	@RequestMapping("/")
	public String landingPage() {
		return "Login";
	}

	@Autowired // spring boot creates object
	private StudentService service;

	@GetMapping("/service")
	public List<Student> getStudent() {
		return this.service.getStudents();
	}

	@GetMapping("/service/{studentId}")
	public ResponseEntity<Student> getSingleStudent(@PathVariable int studentId) {
		Student student = service.getSingleStudent(studentId);
		if (student != null) {
			return ResponseEntity.ok(student);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/service")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student addedStudent = this.service.addStudent(student);
        return new ResponseEntity<>(addedStudent, HttpStatus.CREATED);
    }

    @PutMapping("/service")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student updatedStudent = this.service.updateStudent(student);
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/service/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) {
        this.service.deleteStudent(studentId);
        return ResponseEntity.noContent().build();

	}
}
