package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.Feedback;

@Service
public interface FeedbackService {

	// METHOD TO GET FEEDBACK DATA
	public List<Feedback> getFeedbacks();
	
	// METHOD TO ADD NEW FEEDBACK DATA
	public Feedback addFeedback(Feedback feedback);
}
