package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.List;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(generator = "quiz-id-gen")
    @GenericGenerator(name = "quiz-id-gen", strategy = "com.flexisaf.flexisafquiz.util.CustomIdGenerator",
            parameters = @Parameter(name = "prefix", value = "QUIZ-"))
    private String id;

    private String name;

    @Enumerated(EnumType.STRING)
    private DifficultyType type;

    @ManyToMany
    private List<Subject> subjects;

    // Getters and Setters

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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
