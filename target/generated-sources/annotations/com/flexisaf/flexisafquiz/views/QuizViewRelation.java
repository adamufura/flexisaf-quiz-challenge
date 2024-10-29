package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodListAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(QuizView.class)
public class QuizViewRelation<T, A extends MethodAttribute<?, ?>> extends AttributePathWrapper<T, QuizView, QuizView> {

    public QuizViewRelation(AttributePath<T, QuizView, QuizView> path) {
        super(path);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<QuizView, Long> attribute = QuizView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> name() {
        MethodSingularAttribute<QuizView, String> attribute = QuizView_.name;
        return attribute == null ? getWrapped().<String>get("name") : getWrapped().get(attribute);
    }

    public QuizSubjectViewRelation<T, MethodListAttribute<QuizView, QuizSubjectView>> subjects() {
        QuizSubjectViewRelation<QuizView, MethodListAttribute<QuizView, QuizSubjectView>> relation = QuizView_.subjects;
        return new QuizSubjectViewRelation<>(relation == null ? getWrapped().<QuizSubjectView>get("subjects") : getWrapped().get(relation));
    }

    public AttributePath<T, DifficultyType, DifficultyType> type() {
        MethodSingularAttribute<QuizView, DifficultyType> attribute = QuizView_.type;
        return attribute == null ? getWrapped().<DifficultyType>get("type") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

