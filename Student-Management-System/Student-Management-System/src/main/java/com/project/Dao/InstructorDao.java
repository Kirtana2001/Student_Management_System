package com.project.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Instructor;

public interface InstructorDao extends JpaRepository<Instructor, String> {

}
