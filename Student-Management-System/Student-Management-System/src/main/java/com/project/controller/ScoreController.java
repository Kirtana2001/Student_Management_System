package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Score;
import com.project.service.ScoreService;

@RestController
@RequestMapping("/project/score")
public class ScoreController {
	
	@Autowired // spring boot creates object
	private ScoreService service;
	
	@GetMapping("/service")
	public List<Score> getScores() {
		return this.service.getScores();
	}

	@PostMapping("/service")
	public Score addScore(@RequestBody Score score) {
		return this.service.addScore(score);
	}
	
	

}
