package com.flexisaf.flexisafquiz.dto;

import java.util.UUID;

public class ExamQuestionDTO {
    private UUID id;
    private String questionText;
    private boolean correct;

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}