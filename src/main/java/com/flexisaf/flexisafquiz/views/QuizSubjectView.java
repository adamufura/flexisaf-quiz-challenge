package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.flexisaf.flexisafquiz.model.Subject;

import java.util.List;

@EntityView(Subject.class)
public interface QuizSubjectView {

    @IdMapping
    Long getId();

    String getName();

    List<QuizQuestionView> getQuestions();
}