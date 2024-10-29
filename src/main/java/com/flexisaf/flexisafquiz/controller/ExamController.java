package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.AnswerQuestionRequest;
import com.flexisaf.flexisafquiz.dto.StartExamRequest;
import com.flexisaf.flexisafquiz.dto.Response; // Assuming you have a Response DTO
import com.flexisaf.flexisafquiz.service.interfaces.IExamService; // Use the interface
import com.flexisaf.flexisafquiz.views.ExamView;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Tag(name = "Exams Controller", description = "Operations related to exams")
@RestController
@RequestMapping("/api/exams")
public class ExamController {

    @Autowired
    private IExamService examService;

    @Operation(summary = "Start a new exam",
            description = "Initiates a new exam for a student based on the provided quiz ID.")
    @PostMapping("/start")
    public ResponseEntity<Response> startExam(@RequestBody StartExamRequest request) {
        Response response = examService.startExam(request.getStudentId(), request.getQuizId());
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @Operation(summary = "Answer a question in an exam",
            description = "Submits an answer for a specific question in an ongoing exam.")
    @PostMapping("/{examId}/questions/{questionId}/answer")
    public ResponseEntity<Response> answerQuestion(
            @PathVariable Long examId,
            @PathVariable Long questionId,
            @RequestBody AnswerQuestionRequest request) {
        Response response = examService.answerQuestion(examId, questionId, request.getSelectedOption());
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @Operation(summary = "Get the score of an exam",
            description = "Retrieves the total score of a specific exam based on the correct answers.")
    @GetMapping("/{examId}/score")
    public ResponseEntity<Response> getExamScore(@PathVariable Long examId) {
        Response response = examService.getExamScore(examId);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

}
