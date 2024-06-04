package com.flexisaf.flexisafquiz.dto;

import java.util.UUID;

public class StudentExamDTO {
    private UUID examId;
    private String quizName;
    private int score;

    public UUID getExamId() {
        return examId;
    }

    public void setExamId(UUID examId) {
        this.examId = examId;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
