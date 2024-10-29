package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(QuestionSummaryView.class)
public abstract class QuestionSummaryView_ {
    public static volatile MethodSingularAttribute<QuestionSummaryView, Long> id;
    public static volatile MethodSingularAttribute<QuestionSummaryView, String> text;

    public static final String ID = "id";
    public static final String TEXT = "text";

    public static EntityViewSetting<QuestionSummaryView, CriteriaBuilder<QuestionSummaryView>> createSettingInit() {
        return EntityViewSetting.create(QuestionSummaryView.class, "init");
    }
    public static EntityViewSetting<QuestionSummaryView, PaginatedCriteriaBuilder<QuestionSummaryView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(QuestionSummaryView.class, firstResult, maxResults, "init");
    }

}

