package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.AnswerQuestionRequest;
import com.flexisaf.flexisafquiz.model.Exam;
import com.flexisaf.flexisafquiz.dto.StartExamRequest;
import com.flexisaf.flexisafquiz.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    @Autowired
    private ExamService examService;

    @PostMapping("/start")
    public ResponseEntity<Exam> startExam(@RequestBody StartExamRequest request) {
        Exam exam = examService.startExam(request.getStudentId(), request.getQuizId());
        return ResponseEntity.ok(exam);
    }

    @PostMapping("/{examId}/questions/{questionId}/answer")
    public ResponseEntity<String> answerQuestion(
            @PathVariable UUID examId,
            @PathVariable UUID questionId,
            @RequestBody AnswerQuestionRequest request) {
        examService.answerQuestion(examId, questionId, request.getSelectedOption());
        return ResponseEntity.ok("Question answered successfully.");
    }

    @GetMapping("/{examId}/score")
    public ResponseEntity<Integer> getExamScore(@PathVariable UUID examId) {
        int score = examService.getExamScore(examId);
        return ResponseEntity.ok(score);
    }

    @GetMapping("/students/{studentId}/history")
    public ResponseEntity<List<Exam>> getExamHistory(@PathVariable UUID studentId) {
        List<Exam> examHistory = examService.getExamHistory(studentId);
        return ResponseEntity.ok(examHistory);
    }
}
