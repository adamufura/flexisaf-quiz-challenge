package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Subject {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Question> questions;

    // Getters and Setters

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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
