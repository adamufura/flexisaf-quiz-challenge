package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.QuizDTO;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Quizzes Controller", description = "Operations related to quizzes")
@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @Operation(summary = "Create a new quiz", description = "This endpoint creates a new quiz.")
    @PostMapping
    public ResponseEntity<QuizDTO> createQuiz(@RequestBody QuizDTO quizDTO) {
        QuizDTO createdQuizDTO = quizService.createQuiz(quizDTO);
        return ResponseEntity.ok(createdQuizDTO);
    }

    @Operation(summary = "Get a quiz by ID", description = "This endpoint retrieves a quiz by its ID.")
    @GetMapping("/{quizId}")
    public ResponseEntity<QuizDTO> getQuiz(
            @Parameter(description = "The ID of the quiz") @PathVariable String quizId) {
        return quizService.getQuiz(quizId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Get all quizzes", description = "This endpoint retrieves all quizzes.")
    @GetMapping
    public ResponseEntity<List<QuizDTO>> getAllQuizzes() {
        List<QuizDTO> quizDTOs = quizService.getAllQuizzes();
        return ResponseEntity.ok(quizDTOs);
    }

    @Operation(summary = "Delete a quiz", description = "This endpoint deletes a quiz.")
    @DeleteMapping("/{quizId}")
    public ResponseEntity<Void> deleteQuiz(
            @Parameter(description = "The ID of the quiz") @PathVariable String quizId) {
        if (quizService.deleteQuiz(quizId)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
