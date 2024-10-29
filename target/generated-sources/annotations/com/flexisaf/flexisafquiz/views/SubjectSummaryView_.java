package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(SubjectSummaryView.class)
public abstract class SubjectSummaryView_ {
    public static volatile MethodSingularAttribute<SubjectSummaryView, Long> id;
    public static volatile MethodSingularAttribute<SubjectSummaryView, String> name;

    public static final String ID = "id";
    public static final String NAME = "name";

    public static EntityViewSetting<SubjectSummaryView, CriteriaBuilder<SubjectSummaryView>> createSettingInit() {
        return EntityViewSetting.create(SubjectSummaryView.class, "init");
    }
    public static EntityViewSetting<SubjectSummaryView, PaginatedCriteriaBuilder<SubjectSummaryView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(SubjectSummaryView.class, firstResult, maxResults, "init");
    }

}

