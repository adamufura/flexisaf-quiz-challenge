package com.flexisaf.flexisafquiz.dto;

import java.util.UUID;

public class StartExamRequest {
    private UUID studentId;
    private String quizId;

    // Getters and Setters

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
}
