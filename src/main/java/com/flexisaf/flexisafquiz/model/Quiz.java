package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Quiz name cannot be blank")
    @Size(max = 50, message = "Quiz name cannot exceed 50 characters")
    private String name;

    @NotNull(message = "Difficulty type is required")
    @Enumerated(EnumType.STRING)
    private DifficultyType type;

    @NotNull(message = "Quiz must include at least one subject")
    @ManyToMany
    private List<Subject> subjects;
}
