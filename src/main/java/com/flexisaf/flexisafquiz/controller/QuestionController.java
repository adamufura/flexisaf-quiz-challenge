package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Question;
import com.flexisaf.flexisafquiz.service.interfaces.IQuestionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Questions Controller", description = "Operations related to questions")
@RestController
@RequestMapping("/api/questions")
@Validated
public class QuestionController {

    @Autowired
    private IQuestionService questionService;

    @Operation(summary = "Create a new question",
            description = "This endpoint creates a new question in the system.")
    @PostMapping
    public ResponseEntity<Response> createQuestion(@Valid @RequestBody Question question) {
        Response response = questionService.saveQuestion(question);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @Operation(summary = "Get all questions",
            description = "This endpoint retrieves all questions.")
    @GetMapping
    public ResponseEntity<Response> getAllQuestions() {
        Response response = questionService.findAllQuestions();
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @Operation(summary = "Get a question by ID",
            description = "This endpoint retrieves a question by its ID.")
    @GetMapping("/{questionId}")
    public ResponseEntity<Response> getQuestion(@Valid @PathVariable Long questionId) {
        Response response = questionService.findQuestionById(questionId);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @Operation(summary = "Delete a question",
            description = "This endpoint deletes a question by its ID.")
    @DeleteMapping("/{questionId}")
    public ResponseEntity<Response> deleteQuestion(@Valid @PathVariable Long questionId) {
        Response response = questionService.deleteQuestion(questionId);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
}
