package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Quiz;
import com.flexisaf.flexisafquiz.service.interfaces.IQuizService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Quizzes Controller", description = "Operations related to quizzes")
@RestController
@RequestMapping("/api/quizzes")
@Validated
public class QuizController {

    @Autowired
    private IQuizService quizService;

    @Operation(summary = "Get all quizzes",
            description = "This endpoint retrieves all quizzes.")
    @GetMapping
    public ResponseEntity<Response> getAllQuizzes() {
        Response response = quizService.findAllQuizzes();
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @Operation(summary = "Get quiz by ID",
            description = "This endpoint retrieves a quiz by its ID.")
    @GetMapping("/{id}")
    public ResponseEntity<Response> getQuizById(@Valid @PathVariable("id") Long id) {
        Response response = quizService.findQuizById(id);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @Operation(summary = "Delete quiz by ID",
            description = "This endpoint deletes a quiz by its ID.")
    @DeleteMapping("/{id}")
    public ResponseEntity<Response> deleteQuiz(@Valid @PathVariable("id") Long id) {
        Response response = quizService.deleteQuiz(id);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @Operation(summary = "Save a quiz",
            description = "This endpoint saves a new quiz.")
    @PostMapping
    public ResponseEntity<Response> saveQuiz(@Valid @RequestBody Quiz quiz) {
        Response response = quizService.saveQuiz(quiz);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
}
