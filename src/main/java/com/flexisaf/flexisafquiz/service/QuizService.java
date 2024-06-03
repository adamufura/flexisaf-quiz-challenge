package com.flexisaf.flexisafquiz.service;

import com.flexisaf.flexisafquiz.dto.QuizDTO;
import com.flexisaf.flexisafquiz.dto.QuizQuestionDTO;
import com.flexisaf.flexisafquiz.dto.QuizSubjectDTO;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Question;
import com.flexisaf.flexisafquiz.model.Quiz;
import com.flexisaf.flexisafquiz.model.Subject;
import com.flexisaf.flexisafquiz.repository.QuizRepository;
import com.flexisaf.flexisafquiz.repository.QuestionRepository;
import com.flexisaf.flexisafquiz.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public QuizDTO createQuiz(QuizDTO quizDTO) {
        Quiz quiz = new Quiz();
        quiz.setName(quizDTO.getName());
        quiz.setType(quizDTO.getType());

        List<Subject> subjects = subjectRepository.findAllById(quizDTO.getSubjectIds());
        quiz.setSubjects(subjects);

        Quiz createdQuiz = quizRepository.save(quiz);
        return mapToDTO(createdQuiz);
    }

    public Optional<QuizDTO> getQuiz(String quizId) {
        Optional<Quiz> quizOptional = quizRepository.findById(quizId);
        return quizOptional.map(this::mapToDTO);
    }

    public List<QuizDTO> getAllQuizzes() {
        List<Quiz> quizzes = quizRepository.findAll();
        return quizzes.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public boolean deleteQuiz(String quizId) {
        if (quizRepository.existsById(quizId)) {
            quizRepository.deleteById(quizId);
            return true;
        }
        return false;
    }

    public QuizDTO mapToDTO(Quiz quiz) {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setId(quiz.getId());
        quizDTO.setName(quiz.getName());
        quizDTO.setType(quiz.getType());
        quizDTO.setSubjectIds(quiz.getSubjects().stream().map(Subject::getId).collect(Collectors.toList()));

        // Fetch subjects from the database based on the provided subject IDs
        List<Subject> subjects = subjectRepository.findAllById(quizDTO.getSubjectIds());

        // Map subjects to DTOs
        List<QuizSubjectDTO> subjectDTOs = subjects.stream()
                .map(subject -> {
                    QuizSubjectDTO subjectDTO = new QuizSubjectDTO();
                    subjectDTO.setId(subject.getId());
                    subjectDTO.setName(subject.getName());
                    return subjectDTO;
                })
                .collect(Collectors.toList());

        quizDTO.setSubjects(subjectDTOs);

        List<QuizQuestionDTO> questions = new ArrayList<>();
        for (Subject subject : subjects) {
            // Fetch questions only for the specified difficulty of the quiz
            List<Question> questionList = questionRepository.findBySubjectIdAndDifficulty(subject.getId(), quiz.getType());
            for (Question question : questionList) {
                QuizQuestionDTO questionDTO = new QuizQuestionDTO();
                questionDTO.setId(question.getId());
                questionDTO.setText(question.getText());
                questionDTO.setDifficulty(question.getDifficulty().toString());
                questionDTO.setOptionA(question.getOptionA());
                questionDTO.setOptionB(question.getOptionB());
                questionDTO.setOptionC(question.getOptionC());
                questionDTO.setOptionD(question.getOptionD());
                questionDTO.setCorrectOption(question.getCorrectOption());
                questions.add(questionDTO);
            }
        }
        quizDTO.setQuestions(questions);

        return quizDTO;
    }

}
