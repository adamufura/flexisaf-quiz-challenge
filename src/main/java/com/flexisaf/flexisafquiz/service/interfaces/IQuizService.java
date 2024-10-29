package com.flexisaf.flexisafquiz.service.interfaces;

import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Quiz;

public interface IQuizService {

    Response findAllQuizzes();

    Response findQuizById(Long quizId);

    Response deleteQuiz(Long quizId);

    Response saveQuiz(Quiz quiz);
}