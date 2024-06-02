package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.QuestionDTO;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Questions Controller", description = "Operations related to questions")
@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Operation(summary = "Create a new question",
            description = "This endpoint creates a new question.")
    @PostMapping
    public ResponseEntity<QuestionDTO> createQuestion(@RequestBody QuestionDTO questionDTO) {
        QuestionDTO question = questionService.createQuestion(
                questionDTO.getSubjectId(),
                questionDTO.getText(),
                questionDTO.getDifficulty(),
                questionDTO.getOptionA(),
                questionDTO.getOptionB(),
                questionDTO.getOptionC(),
                questionDTO.getOptionD(),
                questionDTO.getCorrectOption()
        );
        return ResponseEntity.ok(question);
    }

    @Operation(summary = "Get questions for a subject by difficulty",
            description = "This endpoint retrieves questions for a subject by the specified difficulty.")
    @GetMapping("/{subjectId}/{difficulty}")
    public ResponseEntity<List<QuestionDTO>> getQuestionsForSubject(
            @Parameter(description = "The ID of the subject") @PathVariable String subjectId,
            @Parameter(description = "The difficulty level of the questions") @PathVariable DifficultyType difficulty) {
        return ResponseEntity.ok(questionService.getQuestionsForSubject(subjectId, difficulty));
    }

    @Operation(summary = "Update a question",
            description = "This endpoint updates an existing question.")
    @PutMapping("/{questionId}")
    public ResponseEntity<QuestionDTO> updateQuestion(
            @Parameter(description = "The ID of the question") @PathVariable Long questionId,
            @RequestBody QuestionDTO questionDTO) {
        return questionService.updateQuestion(
                        questionId,
                        questionDTO.getText(),
                        questionDTO.getDifficulty(),
                        questionDTO.getOptionA(),
                        questionDTO.getOptionB(),
                        questionDTO.getOptionC(),
                        questionDTO.getOptionD(),
                        questionDTO.getCorrectOption()
                ).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Delete a question",
            description = "This endpoint deletes a question.")
    @DeleteMapping("/{questionId}")
    public ResponseEntity<Void> deleteQuestion(
            @Parameter(description = "The ID of the question") @PathVariable Long questionId) {
        if (questionService.deleteQuestion(questionId)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
