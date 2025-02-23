package com.quiz.entities;



// we are creating the replica of Question entity to use it inside my quiz service
// we will remove all the Db related annotations.

public class Question {

    private Long questionId ;
    private String question;
    private Long quizId;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }
}
