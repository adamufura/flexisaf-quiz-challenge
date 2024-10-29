package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Question text cannot be blank")
    @Size(max = 255, message = "Question text cannot exceed 255 characters")
    private String text;

    @NotNull(message = "Difficulty level is required")
    @Enumerated(EnumType.STRING)
    private DifficultyType difficulty;

    @NotBlank(message = "Option A cannot be blank")
    @Size(max = 100, message = "Option A cannot exceed 100 characters")
    private String optionA;

    @NotBlank(message = "Option B cannot be blank")
    @Size(max = 100, message = "Option B cannot exceed 100 characters")
    private String optionB;

    @NotBlank(message = "Option C cannot be blank")
    @Size(max = 100, message = "Option C cannot exceed 100 characters")
    private String optionC;

    @NotBlank(message = "Option D cannot be blank")
    @Size(max = 100, message = "Option D cannot exceed 100 characters")
    private String optionD;

    @NotBlank(message = "Correct option cannot be blank")
    @Size(max = 1, message = "Correct option must be a single character (e.g., A, B, C, or D)")
    private String correctOption;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    @NotNull(message = "Subject is required")
    private Subject subject;
}