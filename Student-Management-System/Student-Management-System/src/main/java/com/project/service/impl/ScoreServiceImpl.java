package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Dao.ScoreDao;
import com.project.entity.Score;
import com.project.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService{
	
	@Autowired
	private ScoreDao scoreDao;

	@Override
	// IMPLEMENTATION TO GET ALL SCORE DATA
	public List<Score> getScores() {
		// TODO Auto-generated method stub
		return scoreDao.findAll();
	}

	// IMPLEMENTATION TO SAVE NEW SCORE DATA
	@Override
	public Score addScore(Score score) {
		scoreDao.save(score);
		return score;
	}

}
