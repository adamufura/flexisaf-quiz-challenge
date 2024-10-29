package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(QuestionSummaryView.class)
public class QuestionSummaryViewRelation<T, A extends MethodAttribute<?, ?>> extends AttributePathWrapper<T, QuestionSummaryView, QuestionSummaryView> {

    public QuestionSummaryViewRelation(AttributePath<T, QuestionSummaryView, QuestionSummaryView> path) {
        super(path);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<QuestionSummaryView, Long> attribute = QuestionSummaryView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> text() {
        MethodSingularAttribute<QuestionSummaryView, String> attribute = QuestionSummaryView_.text;
        return attribute == null ? getWrapped().<String>get("text") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

