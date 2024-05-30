package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private UUID studentId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Quiz quiz;

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExamQuestion> examQuestions = new ArrayList<>();

    // Getters and Setters


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public List<ExamQuestion> getExamQuestions() {
        return examQuestions;
    }

    public void setExamQuestions(List<ExamQuestion> examQuestions) {
        this.examQuestions = examQuestions;
    }
}

