package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.AnswerQuestionRequest;
import com.flexisaf.flexisafquiz.dto.ExamDTO;
import com.flexisaf.flexisafquiz.dto.StartExamRequest;
import com.flexisaf.flexisafquiz.dto.StudentExamDTO;
import com.flexisaf.flexisafquiz.model.Exam;
import com.flexisaf.flexisafquiz.service.ExamService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    private ExamService examService;

    @Operation(summary = "Start a new exam", description = "Initiates a new exam for a student based on the provided quiz ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Exam started successfully",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Exam.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid input",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Quiz not found",
                    content = @Content)
    })
    @PostMapping("/start")
    public ResponseEntity<ExamDTO> startExam(@RequestBody StartExamRequest request) {
        ExamDTO exam = examService.startExam(request.getStudentId(), request.getQuizId());
        return ResponseEntity.ok(exam);
    }

    @Operation(summary = "Answer a question in an exam", description = "Submits an answer for a specific question in an ongoing exam.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Question answered successfully",
                    content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid input",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Exam or Question not found",
                    content = @Content)
    })
    @PostMapping("/{examId}/questions/{questionId}/answer")
    public ResponseEntity<String> answerQuestion(
            @PathVariable UUID examId,
            @PathVariable Long questionId,
            @RequestBody AnswerQuestionRequest request) {
        examService.answerQuestion(examId, questionId, request.getSelectedOption());
        return ResponseEntity.ok("Question answered successfully.");
    }

    @Operation(summary = "Get the score of an exam", description = "Retrieves the total score of a specific exam based on the correct answers.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Score retrieved successfully",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Integer.class)) }),
            @ApiResponse(responseCode = "404", description = "Exam not found",
                    content = @Content)
    })
    @GetMapping("/{examId}/score")
    public ResponseEntity<Integer> getExamScore(@PathVariable UUID examId) {
        int score = examService.getExamScore(examId);
        return ResponseEntity.ok(score);
    }

    @Operation(summary = "Get the exam history of a student", description = "Fetches the list of all exams taken by a student, identified by their student ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Exam history retrieved successfully",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = List.class)) }),
            @ApiResponse(responseCode = "404", description = "Student not found",
                    content = @Content)
    })
    @GetMapping("/students/{studentId}/history")
    public ResponseEntity<List<StudentExamDTO>> getExamHistory(@PathVariable UUID studentId) {
        List<StudentExamDTO> examHistory = examService.getExamHistory(studentId);
        return ResponseEntity.ok(examHistory);
    }
}
