package com.project.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Feedback;

public interface FeedbackDao extends JpaRepository<Feedback, String>{

}
