package com.flexisaf.flexisafquiz.service.impl;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Exam;
import com.flexisaf.flexisafquiz.model.ExamQuestion;
import com.flexisaf.flexisafquiz.model.Question;
import com.flexisaf.flexisafquiz.model.Quiz;
import com.flexisaf.flexisafquiz.repository.ExamRepository;
import com.flexisaf.flexisafquiz.repository.QuestionRepository;
import com.flexisaf.flexisafquiz.repository.QuizRepository;
import com.flexisaf.flexisafquiz.service.interfaces.IExamService;
import com.flexisaf.flexisafquiz.util.FlexiException;
import com.flexisaf.flexisafquiz.views.ExamView;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ExamService implements IExamService {

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private CriteriaBuilderFactory builderFactory;

    @Autowired
    private EntityViewManager viewManager;

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional(rollbackFor = {FlexiException.class})
    public Response startExam(UUID studentId, Long quizId) {
        Response response = new Response();
        try {
            Optional<Quiz> quizOpt = quizRepository.findById(quizId);
            if (!quizOpt.isPresent()) {
                throw new FlexiException("Quiz not found with ID: " + quizId);
            }

            Quiz quiz = quizOpt.get();
            CriteriaBuilder<Question> questionCriteriaBuilder = builderFactory.create(entityManager, Question.class, "q");
            questionCriteriaBuilder.where("q.difficulty").eq(quiz.getType())
                    .where("q.subject").in(quiz.getSubjects());

            List<Question> questions = questionCriteriaBuilder.getResultList();

            Exam exam = new Exam();
            exam.setStudentId(studentId);
            exam.setQuiz(quiz);
            examRepository.save(exam);

            response.setStatusCode(201);
            response.setMessage("Exam started successfully");
            response.setExamView(mapToExamView(exam, questions));
        } catch (FlexiException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error starting exam: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(rollbackFor = {FlexiException.class})
    public Response answerQuestion(Long examId, Long questionId, String selectedOption) {
        Response response = new Response();
        try {
            Optional<Exam> examOpt = examRepository.findById(examId);
            Optional<Question> questionOpt = questionRepository.findById(questionId);

            if (!examOpt.isPresent() || !questionOpt.isPresent()) {
                throw new FlexiException("Exam or Question not found");
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

            response.setStatusCode(200);
            response.setMessage("Answer submitted successfully");
        } catch (FlexiException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error answering question: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(readOnly = true)
    public Response getExamScore(Long examId) {
        Response response = new Response();
        try {
            Optional<Exam> examOpt = examRepository.findById(examId);
            if (!examOpt.isPresent()) {
                throw new FlexiException("Exam not found");
            }

            Exam exam = examOpt.get();
            long correctAnswers = exam.getExamQuestions().stream()
                    .filter(ExamQuestion::isCorrect)
                    .count();

            response.setStatusCode(200);
            response.setMessage("Exam score retrieved successfully");
            response.setScore((int) correctAnswers);
        } catch (FlexiException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error retrieving exam score: " + e.getMessage());
        }
        return response;
    }

    private ExamView mapToExamView(Exam exam, List<Question> questions) {
        return viewManager.find(entityManager, ExamView.class, exam.getId());
    }
}
