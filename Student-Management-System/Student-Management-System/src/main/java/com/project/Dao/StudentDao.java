package com.project.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Student;


public interface StudentDao extends JpaRepository<Student, Integer> {
	
}
