package com.flexisaf.flexisafquiz.service.impl;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Quiz;
import com.flexisaf.flexisafquiz.repository.QuizRepository;
import com.flexisaf.flexisafquiz.service.interfaces.IQuizService;
import com.flexisaf.flexisafquiz.util.FlexiException;
import com.flexisaf.flexisafquiz.views.QuizView;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuizService implements IQuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private CriteriaBuilderFactory builderFactory;

    @Autowired
    private EntityViewManager viewManager;

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public Response findAllQuizzes() {
        Response response = new Response();
        try {
            CriteriaBuilder<Quiz> quizCriteriaBuilder = builderFactory.create(entityManager, Quiz.class, "q");
            List<QuizView> quizViews = viewManager.applySetting(
                    EntityViewSetting.create(QuizView.class),
                    quizCriteriaBuilder
            ).getResultList();

            response.setStatusCode(200);
            response.setMessage("Quizzes retrieved successfully");
            response.setQuizViews(quizViews);
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error retrieving quizzes: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(readOnly = true)
    public Response findQuizById(Long quizId) {
        Response response = new Response();
        try {
            QuizView quizView = viewManager.find(entityManager, QuizView.class, quizId);
            if (quizView == null) {
                throw new FlexiException("Quiz not found with ID: " + quizId);
            }
            response.setStatusCode(200);
            response.setMessage("Quiz found");
            response.setQuizView(quizView);
        } catch (FlexiException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error finding quiz: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(rollbackFor = {FlexiException.class})
    public Response deleteQuiz(Long quizId) {
        Response response = new Response();
        try {
            Quiz quiz = quizRepository.findById(quizId)
                    .orElseThrow(() -> new FlexiException("Quiz not found with ID: " + quizId));
            quizRepository.delete(quiz);
            response.setStatusCode(204);
            response.setMessage("Quiz deleted successfully");
        } catch (FlexiException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error deleting quiz: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(rollbackFor = {FlexiException.class})
    public Response saveQuiz(Quiz quiz) {
        Response response = new Response();
        try {
            if (quiz.getName() == null) {
                throw new FlexiException("Quiz name must be provided");
            }

            Quiz savedQuiz = quizRepository.save(quiz);
            QuizView quizView = viewManager.find(entityManager, QuizView.class, savedQuiz.getId());
            response.setStatusCode(201);
            response.setMessage("Quiz saved successfully");
            response.setQuizView(quizView);
        } catch (FlexiException e) {
            response.setStatusCode(400);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error saving quiz: " + e.getMessage());
        }
        return response;
    }
}
