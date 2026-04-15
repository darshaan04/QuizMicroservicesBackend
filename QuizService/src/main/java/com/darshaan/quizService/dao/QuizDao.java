package com.darshaan.quizService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darshaan.quizService.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
