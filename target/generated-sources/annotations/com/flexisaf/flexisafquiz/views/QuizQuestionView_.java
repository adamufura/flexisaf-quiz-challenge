package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(QuizQuestionView.class)
public abstract class QuizQuestionView_ {
    public static volatile MethodSingularAttribute<QuizQuestionView, String> correctOption;
    public static volatile MethodSingularAttribute<QuizQuestionView, DifficultyType> difficulty;
    public static volatile MethodSingularAttribute<QuizQuestionView, Long> id;
    public static volatile MethodSingularAttribute<QuizQuestionView, String> optionA;
    public static volatile MethodSingularAttribute<QuizQuestionView, String> optionB;
    public static volatile MethodSingularAttribute<QuizQuestionView, String> optionC;
    public static volatile MethodSingularAttribute<QuizQuestionView, String> optionD;
    public static volatile MethodSingularAttribute<QuizQuestionView, String> text;

    public static final String CORRECT_OPTION = "correctOption";
    public static final String DIFFICULTY = "difficulty";
    public static final String ID = "id";
    public static final String OPTION_A = "optionA";
    public static final String OPTION_B = "optionB";
    public static final String OPTION_C = "optionC";
    public static final String OPTION_D = "optionD";
    public static final String TEXT = "text";

    public static EntityViewSetting<QuizQuestionView, CriteriaBuilder<QuizQuestionView>> createSettingInit() {
        return EntityViewSetting.create(QuizQuestionView.class, "init");
    }
    public static EntityViewSetting<QuizQuestionView, PaginatedCriteriaBuilder<QuizQuestionView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(QuizQuestionView.class, firstResult, maxResults, "init");
    }

}

