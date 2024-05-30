package com.flexisaf.flexisafquiz.dto;

import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Subject;

import java.util.List;
import java.util.UUID;

public class QuizDTO {
    private UUID id;
    private String name;
    private DifficultyType type;
    private List<Subject> subjects;
    private List<UUID> subjectIds;

    // Constructors, Getters, and Setters

    public QuizDTO() {
    }

    public QuizDTO(UUID id, String name, DifficultyType type, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.subjects = subjects;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<UUID> getSubjectIds() {
        return subjectIds;
    }

    public void setSubjectIds(List<UUID> subjectIds) {
        this.subjectIds = subjectIds;
    }

}
