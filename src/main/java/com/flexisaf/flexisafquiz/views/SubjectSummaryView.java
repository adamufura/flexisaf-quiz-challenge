package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.flexisaf.flexisafquiz.model.Subject;

@EntityView(Subject.class)
public interface SubjectSummaryView {

    @IdMapping
    Long getId();

    String getName();
}
