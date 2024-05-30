package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Quiz {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @Enumerated(EnumType.STRING)
    private DifficultyType type;

    @ManyToMany
    private List<Subject> subjects;

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
