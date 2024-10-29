package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(ExamQuestionView.class)
public abstract class ExamQuestionView_ {
    public static volatile MethodSingularAttribute<ExamQuestionView, Boolean> correct;
    public static volatile MethodSingularAttribute<ExamQuestionView, Long> id;
    public static volatile QuestionViewRelation<ExamQuestionView, MethodSingularAttribute<ExamQuestionView, QuestionView>> question;
    public static volatile MethodSingularAttribute<ExamQuestionView, String> selectedOption;

    public static final String CORRECT = "correct";
    public static final String ID = "id";
    public static final String QUESTION = "question";
    public static final String SELECTED_OPTION = "selectedOption";
    public static final String QUESTIONCORRECT_OPTION = "question.correctOption";
    public static final String QUESTIONDIFFICULTY = "question.difficulty";
    public static final String QUESTIONID = "question.id";
    public static final String QUESTIONOPTION_A = "question.optionA";
    public static final String QUESTIONOPTION_B = "question.optionB";
    public static final String QUESTIONOPTION_C = "question.optionC";
    public static final String QUESTIONOPTION_D = "question.optionD";
    public static final String QUESTIONSUBJECT = "question.subject";
    public static final String QUESTIONTEXT = "question.text";

    public static final String QUESTION__SUBJECTID = "question.subject.id";
    public static final String QUESTION__SUBJECTNAME = "question.subject.name";

    public static EntityViewSetting<ExamQuestionView, CriteriaBuilder<ExamQuestionView>> createSettingInit() {
        return EntityViewSetting.create(ExamQuestionView.class, "init");
    }
    public static EntityViewSetting<ExamQuestionView, PaginatedCriteriaBuilder<ExamQuestionView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(ExamQuestionView.class, firstResult, maxResults, "init");
    }

}

