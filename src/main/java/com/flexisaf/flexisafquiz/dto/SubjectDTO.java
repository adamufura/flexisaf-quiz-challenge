package com.flexisaf.flexisafquiz.dto;

import java.util.UUID;

public class SubjectDTO {
    private UUID id;
    private String name;

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
}
