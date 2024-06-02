package com.flexisaf.flexisafquiz.service;

import com.flexisaf.flexisafquiz.dto.QuestionDTO;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Question;
import com.flexisaf.flexisafquiz.model.Subject;
import com.flexisaf.flexisafquiz.repository.QuestionRepository;
import com.flexisaf.flexisafquiz.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    public QuestionDTO createQuestion(String subjectId, String text, DifficultyType difficulty, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        Optional<Subject> subjectOpt = subjectRepository.findById(subjectId);
        if (!subjectOpt.isPresent()) {
            throw new IllegalArgumentException("Subject not found");
        }

        Question question = new Question();
        question.setText(text);
        question.setDifficulty(difficulty);
        question.setOptionA(optionA);
        question.setOptionB(optionB);
        question.setOptionC(optionC);
        question.setOptionD(optionD);
        question.setCorrectOption(correctOption);
        question.setSubject(subjectOpt.get());

        Question savedQuestion = questionRepository.save(question);
        return mapToDTO(savedQuestion);
    }

    public List<QuestionDTO> getQuestionsForSubject(String subjectId, DifficultyType difficulty) {
        return questionRepository.findBySubjectIdAndDifficulty(subjectId, difficulty)
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public Optional<QuestionDTO> updateQuestion(Long questionId, String text, DifficultyType difficulty, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        Optional<Question> questionOpt = questionRepository.findById(questionId);
        if (!questionOpt.isPresent()) {
            return Optional.empty();
        }

        Question question = questionOpt.get();
        question.setText(text);
        question.setDifficulty(difficulty);
        question.setOptionA(optionA);
        question.setOptionB(optionB);
        question.setOptionC(optionC);
        question.setOptionD(optionD);
        question.setCorrectOption(correctOption);

        Question updatedQuestion = questionRepository.save(question);
        return Optional.of(mapToDTO(updatedQuestion));
    }

    public boolean deleteQuestion(Long questionId) {
        if (!questionRepository.existsById(questionId)) {
            return false;
        }

        questionRepository.deleteById(questionId);
        return true;
    }

    private QuestionDTO mapToDTO(Question question) {
        QuestionDTO dto = new QuestionDTO();
        dto.setId(question.getId());
        dto.setText(question.getText());
        dto.setDifficulty(question.getDifficulty());
        dto.setOptionA(question.getOptionA());
        dto.setOptionB(question.getOptionB());
        dto.setOptionC(question.getOptionC());
        dto.setOptionD(question.getOptionD());
        dto.setCorrectOption(question.getCorrectOption());
        dto.setSubjectId(question.getSubject().getId());
        return dto;
    }
}
