package com.quiz.service.impl;

import com.quiz.entity.QuizEntity;
import com.quiz.repository.QuizRepo;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    QuizRepo quizRepo;

    @Override
    public QuizEntity add(QuizEntity quizEntity) {
        return quizRepo.save(quizEntity);
    }

    @Override
    public List<QuizEntity> getQuiz() {
        return quizRepo.findAll();
    }

    @Override
    public QuizEntity getById(Long id) {
        return quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
    }
}
