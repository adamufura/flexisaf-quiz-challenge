package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodListAttribute;
import com.blazebit.persistence.view.metamodel.MethodPluralAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import java.util.Collection;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(SubjectView.class)
public class SubjectViewMultiRelation<T, C extends Collection<SubjectView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, SubjectView, C> {

    public SubjectViewMultiRelation(AttributePath<T, SubjectView, C> path) {
        super(path);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<SubjectView, Long> attribute = SubjectView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> name() {
        MethodSingularAttribute<SubjectView, String> attribute = SubjectView_.name;
        return attribute == null ? getWrapped().<String>get("name") : getWrapped().get(attribute);
    }

    public QuestionSummaryViewRelation<T, MethodListAttribute<SubjectView, QuestionSummaryView>> questions() {
        QuestionSummaryViewRelation<SubjectView, MethodListAttribute<SubjectView, QuestionSummaryView>> relation = SubjectView_.questions;
        return new QuestionSummaryViewRelation<>(relation == null ? getWrapped().<QuestionSummaryView>get("questions") : getWrapped().get(relation));
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

