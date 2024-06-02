//package com.flexisaf.flexisafquiz.service;
//
//import com.flexisaf.flexisafquiz.model.Exam;
//import com.flexisaf.flexisafquiz.model.ExamQuestion;
//import com.flexisaf.flexisafquiz.model.Question;
//import com.flexisaf.flexisafquiz.model.Quiz;
//import com.flexisaf.flexisafquiz.repository.ExamRepository;
//import com.flexisaf.flexisafquiz.repository.QuestionRepository;
//import com.flexisaf.flexisafquiz.repository.QuizRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.UUID;
//import java.util.Optional;
//
//@Service
//public class ExamService {
//
//    @Autowired
//    private ExamRepository examRepository;
//
//    @Autowired
//    private QuizRepository quizRepository;
//
//    @Autowired
//    private QuestionRepository questionRepository;
//
//    public Exam startExam(UUID studentId, UUID quizId) {
//        Optional<Quiz> quiz = quizRepository.findById(quizId);
//        if (!quiz.isPresent()) {
//            throw new IllegalArgumentException("Quiz not found");
//        }
//
//        Exam exam = new Exam();
//        exam.setStudentId(studentId);
//        exam.setQuiz(quiz.get());
//        return examRepository.save(exam);
//    }
//
//    public void answerQuestion(UUID examId, UUID questionId, String selectedOption) {
//        Optional<Exam> examOpt = examRepository.findById(examId);
//        Optional<Question> questionOpt = questionRepository.findById(questionId);
//
//        if (!examOpt.isPresent() || !questionOpt.isPresent()) {
//            throw new IllegalArgumentException("Exam or Question not found");
//        }
//
//        Exam exam = examOpt.get();
//        Question question = questionOpt.get();
//
//        ExamQuestion examQuestion = new ExamQuestion();
//        examQuestion.setExam(exam);
//        examQuestion.setQuestion(question);
//        examQuestion.setSelectedOption(selectedOption);
//        examQuestion.setCorrect(question.getCorrectOption().equals(selectedOption));
//
//        exam.getExamQuestions().add(examQuestion);
//        examRepository.save(exam);
//    }
//
//    public int getExamScore(UUID examId) {
//        Optional<Exam> examOpt = examRepository.findById(examId);
//        if (!examOpt.isPresent()) {
//            throw new IllegalArgumentException("Exam not found");
//        }
//
//        Exam exam = examOpt.get();
//        long correctAnswers = exam.getExamQuestions().stream()
//                .filter(ExamQuestion::isCorrect)
//                .count();
//
//        return (int) correctAnswers;
//    }
//
//    public List<Exam> getExamHistory(UUID studentId) {
//        return examRepository.findAllByStudentId(studentId);
//    }
//}
