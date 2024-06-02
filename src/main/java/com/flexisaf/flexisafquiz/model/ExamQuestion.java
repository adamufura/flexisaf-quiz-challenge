//package com.flexisaf.flexisafquiz.model;
//
//import jakarta.persistence.*;
//
//import java.util.UUID;
//
//@Entity
//public class ExamQuestion {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(nullable = false)
//    private Exam exam;
//
//    @ManyToOne
//    @JoinColumn(nullable = false)
//    private Question question;
//
//    @Column(nullable = false)
//    private String selectedOption;
//
//    @Column(nullable = false)
//    private boolean isCorrect;
//
//    // Getters and Setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Exam getExam() {
//        return exam;
//    }
//
//    public void setExam(Exam exam) {
//        this.exam = exam;
//    }
//
//    public Question getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(Question question) {
//        this.question = question;
//    }
//
//    public String getSelectedOption() {
//        return selectedOption;
//    }
//
//    public void setSelectedOption(String selectedOption) {
//        this.selectedOption = selectedOption;
//    }
//
//    public boolean isCorrect() {
//        return isCorrect;
//    }
//
//    public void setCorrect(boolean correct) {
//        isCorrect = correct;
//    }
//}
