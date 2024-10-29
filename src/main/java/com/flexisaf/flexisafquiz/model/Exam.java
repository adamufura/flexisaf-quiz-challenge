package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

@Data
@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private UUID studentId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Quiz quiz;

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExamQuestion> examQuestions = new ArrayList<>();
}