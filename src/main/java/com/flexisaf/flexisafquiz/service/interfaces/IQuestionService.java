package com.flexisaf.flexisafquiz.service.interfaces;

import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Question;

public interface IQuestionService {

    Response findAllQuestions();

    Response findQuestionById(Long questionId);

    Response deleteQuestion(Long questionId);

    Response saveQuestion(Question question);
}
