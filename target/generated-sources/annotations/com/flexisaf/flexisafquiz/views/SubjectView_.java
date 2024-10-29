package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodListAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(SubjectView.class)
public abstract class SubjectView_ {
    public static volatile MethodSingularAttribute<SubjectView, Long> id;
    public static volatile MethodSingularAttribute<SubjectView, String> name;
    public static volatile QuestionSummaryViewRelation<SubjectView, MethodListAttribute<SubjectView, QuestionSummaryView>> questions;

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String QUESTIONS = "questions";
    public static final String QUESTIONSID = "questions.id";
    public static final String QUESTIONSTEXT = "questions.text";

    public static EntityViewSetting<SubjectView, CriteriaBuilder<SubjectView>> createSettingInit() {
        return EntityViewSetting.create(SubjectView.class, "init");
    }
    public static EntityViewSetting<SubjectView, PaginatedCriteriaBuilder<SubjectView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(SubjectView.class, firstResult, maxResults, "init");
    }

}

