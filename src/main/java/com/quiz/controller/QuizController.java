package com.quiz.controller;

import com.quiz.entity.QuizEntity;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/addQuiz")
    public QuizEntity addQuiz(@RequestBody QuizEntity quizEntity) {
        return quizService.add(quizEntity);
    }

    @GetMapping("/getQuiz")
    public List<QuizEntity> getQuiz() {
        return quizService.getQuiz();
    }

    @GetMapping("/getOne/id/{myid}")
    public QuizEntity getOne(@PathVariable Long myid) {
        return quizService.getById(myid);
    }

}
