package com.flexisaf.flexisafquiz.service;

import com.flexisaf.flexisafquiz.dto.ExamDTO;
import com.flexisaf.flexisafquiz.dto.ExamQuestionDTO;
import com.flexisaf.flexisafquiz.dto.StudentExamDTO;
import com.flexisaf.flexisafquiz.model.Exam;
import com.flexisaf.flexisafquiz.model.ExamQuestion;
import com.flexisaf.flexisafquiz.model.Question;
import com.flexisaf.flexisafquiz.model.Quiz;
import com.flexisaf.flexisafquiz.repository.ExamRepository;
import com.flexisaf.flexisafquiz.repository.QuestionRepository;
import com.flexisaf.flexisafquiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Optional;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public ExamDTO startExam(UUID studentId, String quizId) {
        // Check if the quiz exists
        Optional<Quiz> quizOpt = quizRepository.findById(quizId);
        if (!quizOpt.isPresent()) {
            throw new IllegalArgumentException("Quiz not found");
        }

        // Get the quiz and related questions
        Quiz quiz = quizOpt.get();
        List<Question> questions = questionRepository.findByDifficultyAndSubjectsIn(quiz.getType(), quiz.getSubjects());

        // Create an exam entity and save it
        Exam exam = new Exam();
        exam.setStudentId(studentId);
        exam.setQuiz(quiz);
        examRepository.save(exam);

        // Map the exam entity and questions to DTO
        return mapToDTO(exam, questions);
    }

    public void answerQuestion(UUID examId, Long questionId, String selectedOption) {
        Optional<Exam> examOpt = examRepository.findById(examId);
        Optional<Question> questionOpt = questionRepository.findById(questionId);

        if (!examOpt.isPresent() || !questionOpt.isPresent()) {
            throw new IllegalArgumentException("Exam or Question not found");
        }

        Exam exam = examOpt.get();
        Question question = questionOpt.get();

        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.setExam(exam);
        examQuestion.setQuestion(question);
        examQuestion.setSelectedOption(selectedOption);
        examQuestion.setCorrect(question.getCorrectOption().equals(selectedOption));

        exam.getExamQuestions().add(examQuestion);
        examRepository.save(exam);
    }

    public int getExamScore(UUID examId) {
        Optional<Exam> examOpt = examRepository.findById(examId);
        if (!examOpt.isPresent()) {
            throw new IllegalArgumentException("Exam not found");
        }

        Exam exam = examOpt.get();
        long correctAnswers = exam.getExamQuestions().stream()
                .filter(ExamQuestion::isCorrect)
                .count();

        return (int) correctAnswers;
    }

    public List<StudentExamDTO> getExamHistory(UUID studentId) {
        List<Exam> exams = examRepository.findAllByStudentId(studentId);
        List<StudentExamDTO> studentExamDTOs = new ArrayList<>();

        for (Exam exam : exams) {
            int score = calculateExamScore(exam);
            StudentExamDTO studentExamDTO = new StudentExamDTO();
            studentExamDTO.setExamId(exam.getId());
            studentExamDTO.setQuizName(exam.getQuiz().getName());
            studentExamDTO.setScore(score);
            studentExamDTOs.add(studentExamDTO);
        }

        return studentExamDTOs;
    }

    private int calculateExamScore(Exam exam) {
        return exam.getExamQuestions().stream()
                .filter(ExamQuestion::isCorrect)
                .mapToInt(question -> 1)
                .sum();
    }



    public ExamDTO mapToDTO(Exam exam, List<Question> questions) {
        ExamDTO examDTO = new ExamDTO();
        examDTO.setId(exam.getId());
        examDTO.setStudentId(exam.getStudentId());
        examDTO.setQuizId(exam.getQuiz().getId());

        List<ExamQuestionDTO> examQuestionDTOs = new ArrayList<>();
        for (Question question : questions) {
            ExamQuestionDTO examQuestionDTO = new ExamQuestionDTO();
            examQuestionDTO.setId(question.getId());
            examQuestionDTO.setQuestionText(question.getText());
            examQuestionDTO.setOptionA(question.getOptionA());
            examQuestionDTO.setOptionB(question.getOptionB());
            examQuestionDTO.setOptionC(question.getOptionC());
            examQuestionDTO.setOptionD(question.getOptionD());
            examQuestionDTOs.add(examQuestionDTO);
        }
        examDTO.setQuestions(examQuestionDTOs);

        return examDTO;
    }
}
