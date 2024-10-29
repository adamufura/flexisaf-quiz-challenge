package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.flexisaf.flexisafquiz.model.Question;

@EntityView(Question.class)
public interface QuestionSummaryView {

    @IdMapping
    Long getId();

    String getText();
}