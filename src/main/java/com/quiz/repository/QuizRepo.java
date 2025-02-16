package com.quiz.repository;

import com.quiz.entity.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<QuizEntity, Long> {
}
