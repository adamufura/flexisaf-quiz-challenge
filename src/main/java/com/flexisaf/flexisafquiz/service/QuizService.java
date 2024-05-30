package com.flexisaf.flexisafquiz.service;

import com.flexisaf.flexisafquiz.dto.QuizDTO;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Quiz;
import com.flexisaf.flexisafquiz.model.Subject;
import com.flexisaf.flexisafquiz.repository.QuizRepository;
import com.flexisaf.flexisafquiz.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    public Quiz createQuiz(String name, DifficultyType type, List<UUID> subjectIds) {
        List<Subject> subjects = subjectRepository.findAllById(subjectIds);
        Quiz quiz = new Quiz();
        quiz.setName(name);
        quiz.setType(type);
        quiz.setSubjects(subjects);
        return quizRepository.save(quiz);
    }

    public Optional<Quiz> getQuiz(UUID quizId) {
        return quizRepository.findById(quizId);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public boolean deleteQuiz(UUID quizId) {
        if (!quizRepository.existsById(quizId)) {
            return false;
        }

        quizRepository.deleteById(quizId);
        return true;
    }

    public QuizDTO mapToDTO(Quiz quiz) {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setId(quiz.getId());
        quizDTO.setName(quiz.getName());
        quizDTO.setType(quiz.getType());
        quizDTO.setSubjectIds(quiz.getSubjects().stream().map(Subject::getId).collect(Collectors.toList()));
        return quizDTO;
    }

    public List<QuizDTO> mapToDTOList(List<Quiz> quizzes) {
        return quizzes.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }
}