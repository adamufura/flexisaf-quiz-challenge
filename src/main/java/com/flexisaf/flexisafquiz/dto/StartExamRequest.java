package com.flexisaf.flexisafquiz.dto;

import java.util.UUID;

public class StartExamRequest {
    private UUID studentId;
    private UUID quizId;

    // Getters and Setters

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public UUID getQuizId() {
        return quizId;
    }

    public void setQuizId(UUID quizId) {
        this.quizId = quizId;
    }
}
