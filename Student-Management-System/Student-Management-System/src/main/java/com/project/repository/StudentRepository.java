package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Integer> {

	// Define a custom query method to find a Student by email
    Student findByEmail(String email);
    
}


