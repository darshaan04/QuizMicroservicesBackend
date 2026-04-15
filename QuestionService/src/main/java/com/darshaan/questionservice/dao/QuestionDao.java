package com.darshaan.questionservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.darshaan.questionservice.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT q.id FROM quizquestions q WHERE q.category = ?1 ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category);
}
