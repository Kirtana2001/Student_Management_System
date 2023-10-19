package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.Score;

@Service
public interface ScoreService {

	// METHOD TO GET ALL SCORE DATA
	public List<Score> getScores();

	// METHOD TO ADD NEW SCORE DATA
	public Score addScore(Score score);

}
