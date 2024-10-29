package com.flexisaf.flexisafquiz.service.impl;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Question;
import com.flexisaf.flexisafquiz.model.Subject;
import com.flexisaf.flexisafquiz.repository.QuestionRepository;
import com.flexisaf.flexisafquiz.service.interfaces.IQuestionService;
import com.flexisaf.flexisafquiz.util.FlexiException;
import com.flexisaf.flexisafquiz.views.QuestionView;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionService implements IQuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private CriteriaBuilderFactory builderFactory;

    @Autowired
    private EntityViewManager viewManager;

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public Response findAllQuestions() {
        Response response = new Response();
        try {
            CriteriaBuilder<Question> questionCriteriaBuilder = builderFactory.create(entityManager, Question.class, "q");
            List<QuestionView> questionViews = viewManager.applySetting(
                    EntityViewSetting.create(QuestionView.class),
                    questionCriteriaBuilder
            ).getResultList();

            response.setStatusCode(200);
            response.setMessage("Questions retrieved successfully");
            response.setQuestionViewList(questionViews);
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error retrieving questions: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(rollbackFor = {FlexiException.class}, readOnly = true)
    public Response findQuestionById(Long questionId) {
        Response response = new Response();
        try {
            QuestionView questionView = viewManager.find(entityManager, QuestionView.class, questionId);
            if (questionView == null) {
                throw new FlexiException("Question not found with ID: " + questionId);
            }
            response.setStatusCode(200);
            response.setMessage("Question found");
            response.setQuestionView(questionView);
        } catch (FlexiException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error finding question: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(rollbackFor = {FlexiException.class})
    public Response deleteQuestion(Long questionId) {
        Response response = new Response();
        try {
            Question question = questionRepository.findById(questionId)
                    .orElseThrow(() -> new FlexiException("Question not found with ID: " + questionId));
            questionRepository.delete(question);
            response.setStatusCode(204);
            response.setMessage("Question deleted successfully");
        } catch (FlexiException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error deleting question: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(rollbackFor = {FlexiException.class})
    public Response saveQuestion(Question question) {
        Response response = new Response();
        try {
            if (question.getSubject() == null || question.getText() == null || question.getOptionA() == null ||
                    question.getOptionB() == null || question.getOptionC() == null || question.getOptionD() == null ||
                    question.getCorrectOption() == null) {
                throw new FlexiException("All fields must be provided");
            }

            Question savedQuestion = questionRepository.save(question);
            QuestionView questionView = viewManager.find(entityManager, QuestionView.class, savedQuestion.getId());
            response.setStatusCode(201);
            response.setMessage("Question saved successfully");
            response.setQuestionView(questionView);
        } catch (FlexiException e) {
            response.setStatusCode(400);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error saving question: " + e.getMessage());
        }
        return response;
    }
}
