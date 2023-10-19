package com.project.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Enrollment;

public interface EnrollmentDao extends JpaRepository<Enrollment, String>{

}
