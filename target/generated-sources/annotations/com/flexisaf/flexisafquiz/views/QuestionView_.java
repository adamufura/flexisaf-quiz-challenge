package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(QuestionView.class)
public abstract class QuestionView_ {
    public static volatile MethodSingularAttribute<QuestionView, String> correctOption;
    public static volatile MethodSingularAttribute<QuestionView, DifficultyType> difficulty;
    public static volatile MethodSingularAttribute<QuestionView, Long> id;
    public static volatile MethodSingularAttribute<QuestionView, String> optionA;
    public static volatile MethodSingularAttribute<QuestionView, String> optionB;
    public static volatile MethodSingularAttribute<QuestionView, String> optionC;
    public static volatile MethodSingularAttribute<QuestionView, String> optionD;
    public static volatile SubjectSummaryViewRelation<QuestionView, MethodSingularAttribute<QuestionView, SubjectSummaryView>> subject;
    public static volatile MethodSingularAttribute<QuestionView, String> text;

    public static final String CORRECT_OPTION = "correctOption";
    public static final String DIFFICULTY = "difficulty";
    public static final String ID = "id";
    public static final String OPTION_A = "optionA";
    public static final String OPTION_B = "optionB";
    public static final String OPTION_C = "optionC";
    public static final String OPTION_D = "optionD";
    public static final String SUBJECT = "subject";
    public static final String TEXT = "text";
    public static final String SUBJECTID = "subject.id";
    public static final String SUBJECTNAME = "subject.name";

    public static EntityViewSetting<QuestionView, CriteriaBuilder<QuestionView>> createSettingInit() {
        return EntityViewSetting.create(QuestionView.class, "init");
    }
    public static EntityViewSetting<QuestionView, PaginatedCriteriaBuilder<QuestionView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(QuestionView.class, firstResult, maxResults, "init");
    }

}

