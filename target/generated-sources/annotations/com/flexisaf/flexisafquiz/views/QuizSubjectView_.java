package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodListAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(QuizSubjectView.class)
public abstract class QuizSubjectView_ {
    public static volatile MethodSingularAttribute<QuizSubjectView, Long> id;
    public static volatile MethodSingularAttribute<QuizSubjectView, String> name;
    public static volatile QuizQuestionViewRelation<QuizSubjectView, MethodListAttribute<QuizSubjectView, QuizQuestionView>> questions;

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String QUESTIONS = "questions";
    public static final String QUESTIONSCORRECT_OPTION = "questions.correctOption";
    public static final String QUESTIONSDIFFICULTY = "questions.difficulty";
    public static final String QUESTIONSID = "questions.id";
    public static final String QUESTIONSOPTION_A = "questions.optionA";
    public static final String QUESTIONSOPTION_B = "questions.optionB";
    public static final String QUESTIONSOPTION_C = "questions.optionC";
    public static final String QUESTIONSOPTION_D = "questions.optionD";
    public static final String QUESTIONSTEXT = "questions.text";

    public static EntityViewSetting<QuizSubjectView, CriteriaBuilder<QuizSubjectView>> createSettingInit() {
        return EntityViewSetting.create(QuizSubjectView.class, "init");
    }
    public static EntityViewSetting<QuizSubjectView, PaginatedCriteriaBuilder<QuizSubjectView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(QuizSubjectView.class, firstResult, maxResults, "init");
    }

}

