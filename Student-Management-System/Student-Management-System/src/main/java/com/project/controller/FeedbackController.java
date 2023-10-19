package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Feedback;
import com.project.service.FeedbackService;

@RestController
@RequestMapping("/project/feedback")
public class FeedbackController {
	
	@Autowired // spring boot creates object
	private FeedbackService service;
	
	@GetMapping("/service")
	public List<Feedback> getFeedbacks() {
		return this.service.getFeedbacks();
	}

	@PostMapping("/service")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		return this.service.addFeedback(feedback);
	}

}
