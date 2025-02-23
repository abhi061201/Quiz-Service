package com.quiz.service.Impl;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepository;
import com.quiz.service.QuestionClient;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionClient questionClient;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {

        List <Quiz> quizzes = quizRepository.findAll();
       List <Quiz> newQuizList = quizzes.stream().map(quiz->{
            quiz.setQuestions(questionClient.getAllQuestionByQuizId(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

        return newQuizList;
    }

    @Override
    public Quiz getById(Long id) {

        Quiz quiz = quizRepository.findById(id).orElseThrow(()->new RuntimeException("Quiz Not Found"));
         quiz.setQuestions(questionClient.getAllQuestionByQuizId(quiz.getId()));
        return quiz;
    }
}
