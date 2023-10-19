package com.project.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Score;

public interface ScoreDao extends JpaRepository<Score, String> {

}
