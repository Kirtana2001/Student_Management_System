package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

	// Define a custom query method to find a Student by email
	Admin findByEmail(String email);

}
