package com.flexisaf.flexisafquiz.dto;

import java.util.List;

public class QuizSubjectDTO {
    private String id;
    private String name;
    private List<QuizQuestionDTO> questions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<QuizQuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuizQuestionDTO> questions) {
        this.questions = questions;
    }
}
