package com.flexisaf.flexisafquiz.dto;

import com.flexisaf.flexisafquiz.model.DifficultyType;
import java.util.List;

public class QuizDTO {
    private String id;
    private String name;
    private DifficultyType type;
    private List<String> subjectIds;
    private List<QuizSubjectDTO> subjects; // Change here
    private List<QuizQuestionDTO> questions;

    // Constructors, Getters, and Setters
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

    public DifficultyType getType() {
        return type;
    }

    public void setType(DifficultyType type) {
        this.type = type;
    }

    public List<String> getSubjectIds() {
        return subjectIds;
    }

    public void setSubjectIds(List<String> subjectIds) {
        this.subjectIds = subjectIds;
    }

    public List<QuizSubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<QuizSubjectDTO> subjects) {
        this.subjects = subjects;
    }

    public List<QuizQuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuizQuestionDTO> questions) {
        this.questions = questions;
    }
}
