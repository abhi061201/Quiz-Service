package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.service.Impl.QuizServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizServiceImpl quizService;

    @GetMapping("/getAllQuiz")
    public List<Quiz> getAllQuiz(){
        return quizService.getAllQuiz();
    }

    @GetMapping("/getQuizId/{id}")
    public Quiz getQuizById(@PathVariable Long id){
        return quizService.getById(id);
    }

    @PostMapping("/addQuiz")
    public Quiz addQuiz(@RequestBody Quiz quiz){
        System.out.println("Quiz App log "+quiz.getTitle());
        return quizService.addQuiz(quiz);
    }
}
