package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.flexisaf.flexisafquiz.model.ExamQuestion;

@EntityView(ExamQuestion.class)
public interface ExamQuestionView {

    @IdMapping
    Long getId();

    QuestionView getQuestion();

    String getSelectedOption();

    boolean getCorrect();
}