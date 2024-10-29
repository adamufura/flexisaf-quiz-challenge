package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class ExamQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Exam exam;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Question question;

    @Column(nullable = false)
    private String selectedOption;

    @Column(nullable = false)
    private boolean correct;
}