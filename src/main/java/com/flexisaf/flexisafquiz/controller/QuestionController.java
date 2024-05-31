package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.QuestionDTO;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.UUID;

@Tag(name = "Questions Controller", description = "Operations related to questions")
@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

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

    @GetMapping("/{subjectId}/{difficulty}")
    public ResponseEntity<List<QuestionDTO>> getQuestionsForSubject(@PathVariable UUID subjectId, @PathVariable DifficultyType difficulty) {
        return ResponseEntity.ok(questionService.getQuestionsForSubject(subjectId, difficulty));
    }

    @PutMapping("/{questionId}")
    public ResponseEntity<QuestionDTO> updateQuestion(@PathVariable UUID questionId, @RequestBody QuestionDTO questionDTO) {
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

    @DeleteMapping("/{questionId}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable UUID questionId) {
        if (questionService.deleteQuestion(questionId)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}