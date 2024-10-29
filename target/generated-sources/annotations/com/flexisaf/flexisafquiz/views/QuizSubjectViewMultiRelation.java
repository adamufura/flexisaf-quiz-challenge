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
@StaticRelation(QuizSubjectView.class)
public class QuizSubjectViewMultiRelation<T, C extends Collection<QuizSubjectView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, QuizSubjectView, C> {

    public QuizSubjectViewMultiRelation(AttributePath<T, QuizSubjectView, C> path) {
        super(path);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<QuizSubjectView, Long> attribute = QuizSubjectView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> name() {
        MethodSingularAttribute<QuizSubjectView, String> attribute = QuizSubjectView_.name;
        return attribute == null ? getWrapped().<String>get("name") : getWrapped().get(attribute);
    }

    public QuizQuestionViewRelation<T, MethodListAttribute<QuizSubjectView, QuizQuestionView>> questions() {
        QuizQuestionViewRelation<QuizSubjectView, MethodListAttribute<QuizSubjectView, QuizQuestionView>> relation = QuizSubjectView_.questions;
        return new QuizQuestionViewRelation<>(relation == null ? getWrapped().<QuizQuestionView>get("questions") : getWrapped().get(relation));
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

