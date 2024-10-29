package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Quiz;

import java.util.List;

@EntityView(Quiz.class)
public interface QuizView {

    @IdMapping
    Long getId();

    String getName();

    DifficultyType getType();

    List<QuizSubjectView> getSubjects();
}