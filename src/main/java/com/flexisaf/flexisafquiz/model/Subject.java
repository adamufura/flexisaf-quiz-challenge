package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.List;

@Entity
public class Subject {

    @Id
    @GeneratedValue(generator = "subject-id-gen")
    @GenericGenerator(name = "subject-id-gen", strategy = "com.flexisaf.flexisafquiz.util.CustomIdGenerator",
            parameters = @Parameter(name = "prefix", value = "SUB-"))
    private String id;

    private String name;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Question> questions;

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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
