package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodListAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(QuizView.class)
public abstract class QuizView_ {
    public static volatile MethodSingularAttribute<QuizView, Long> id;
    public static volatile MethodSingularAttribute<QuizView, String> name;
    public static volatile QuizSubjectViewRelation<QuizView, MethodListAttribute<QuizView, QuizSubjectView>> subjects;
    public static volatile MethodSingularAttribute<QuizView, DifficultyType> type;

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String SUBJECTS = "subjects";
    public static final String TYPE = "type";
    public static final String SUBJECTSID = "subjects.id";
    public static final String SUBJECTSNAME = "subjects.name";
    public static final String SUBJECTSQUESTIONS = "subjects.questions";

    public static final String SUBJECTS__QUESTIONSCORRECT_OPTION = "subjects.questions.correctOption";
    public static final String SUBJECTS__QUESTIONSDIFFICULTY = "subjects.questions.difficulty";
    public static final String SUBJECTS__QUESTIONSID = "subjects.questions.id";
    public static final String SUBJECTS__QUESTIONSOPTION_A = "subjects.questions.optionA";
    public static final String SUBJECTS__QUESTIONSOPTION_B = "subjects.questions.optionB";
    public static final String SUBJECTS__QUESTIONSOPTION_C = "subjects.questions.optionC";
    public static final String SUBJECTS__QUESTIONSOPTION_D = "subjects.questions.optionD";
    public static final String SUBJECTS__QUESTIONSTEXT = "subjects.questions.text";

    public static EntityViewSetting<QuizView, CriteriaBuilder<QuizView>> createSettingInit() {
        return EntityViewSetting.create(QuizView.class, "init");
    }
    public static EntityViewSetting<QuizView, PaginatedCriteriaBuilder<QuizView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(QuizView.class, firstResult, maxResults, "init");
    }

}

