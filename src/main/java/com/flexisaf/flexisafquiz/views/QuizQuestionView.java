package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Question;

@EntityView(Question.class)
public interface QuizQuestionView {

    @IdMapping
    Long getId();

    String getText();

    DifficultyType getDifficulty();

    String getOptionA();

    String getOptionB();

    String getOptionC();

    String getOptionD();

    String getCorrectOption();
}