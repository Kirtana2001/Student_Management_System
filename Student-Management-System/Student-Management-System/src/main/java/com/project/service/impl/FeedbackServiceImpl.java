package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Dao.FeedbackDao;
import com.project.entity.Feedback;
import com.project.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	private FeedbackDao feedbackDao;

	// IMPLEMENTATION TO GET ALL FEEDBACK DATA
	@Override
	public List<Feedback> getFeedbacks() {
		// TODO Auto-generated method stub
		return feedbackDao.findAll();
	}

	// IMPLEMENTATION TO SAVE NEW FEEDBACK DATA
	@Override
	public Feedback addFeedback(Feedback feedback) {
		feedbackDao.save(feedback);
		return feedback;
	}
}