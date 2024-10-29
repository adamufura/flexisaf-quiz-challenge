package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.flexisaf.flexisafquiz.model.Subject;

import java.util.List;

@EntityView(Subject.class)
public interface SubjectView {

    @IdMapping
    Long getId();

    String getName();

    List<QuestionSummaryView> getQuestions();
}
