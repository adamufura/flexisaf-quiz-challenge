package com.flexisaf.flexisafquiz.dto;

import java.util.List;
import java.util.UUID;

public class ExamDTO {

    private UUID id;
    private UUID studentId;
    private String quizId;
    private List<ExamQuestionDTO> questions;

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public List<ExamQuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(List<ExamQuestionDTO> questions) {
        this.questions = questions;
    }
}
