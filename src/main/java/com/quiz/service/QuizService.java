package com.quiz.service;

import com.quiz.entity.QuizEntity;

import java.util.List;

public interface QuizService {

    QuizEntity add(QuizEntity quizEntity);

    List<QuizEntity> getQuiz();

    QuizEntity getById(Long id);
}
