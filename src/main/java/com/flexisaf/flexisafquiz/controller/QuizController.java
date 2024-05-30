package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.QuizDTO;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Quiz;
import com.flexisaf.flexisafquiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    public ResponseEntity<QuizDTO> createQuiz(@RequestBody QuizDTO quizDTO) {
        Quiz createdQuiz = quizService.createQuiz(quizDTO.getName(), quizDTO.getType(), quizDTO.getSubjectIds());
        QuizDTO createdQuizDTO = quizService.mapToDTO(createdQuiz);
        return ResponseEntity.ok(createdQuizDTO);
    }

    @GetMapping("/{quizId}")
    public ResponseEntity<QuizDTO> getQuiz(@PathVariable UUID quizId) {
        return quizService.getQuiz(quizId)
                .map(quizService::mapToDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<QuizDTO>> getAllQuizzes() {
        List<QuizDTO> quizDTOs = quizService.getAllQuizzes().stream()
                .map(quizService::mapToDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(quizDTOs);
    }

    @DeleteMapping("/{quizId}")
    public ResponseEntity<Void> deleteQuiz(@PathVariable UUID quizId) {
        if (quizService.deleteQuiz(quizId)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
