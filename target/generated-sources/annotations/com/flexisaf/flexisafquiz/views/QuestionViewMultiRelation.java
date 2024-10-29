package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodPluralAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import java.util.Collection;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(QuestionView.class)
public class QuestionViewMultiRelation<T, C extends Collection<QuestionView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, QuestionView, C> {

    public QuestionViewMultiRelation(AttributePath<T, QuestionView, C> path) {
        super(path);
    }

    public AttributePath<T, String, String> correctOption() {
        MethodSingularAttribute<QuestionView, String> attribute = QuestionView_.correctOption;
        return attribute == null ? getWrapped().<String>get("correctOption") : getWrapped().get(attribute);
    }

    public AttributePath<T, DifficultyType, DifficultyType> difficulty() {
        MethodSingularAttribute<QuestionView, DifficultyType> attribute = QuestionView_.difficulty;
        return attribute == null ? getWrapped().<DifficultyType>get("difficulty") : getWrapped().get(attribute);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<QuestionView, Long> attribute = QuestionView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> optionA() {
        MethodSingularAttribute<QuestionView, String> attribute = QuestionView_.optionA;
        return attribute == null ? getWrapped().<String>get("optionA") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> optionB() {
        MethodSingularAttribute<QuestionView, String> attribute = QuestionView_.optionB;
        return attribute == null ? getWrapped().<String>get("optionB") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> optionC() {
        MethodSingularAttribute<QuestionView, String> attribute = QuestionView_.optionC;
        return attribute == null ? getWrapped().<String>get("optionC") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> optionD() {
        MethodSingularAttribute<QuestionView, String> attribute = QuestionView_.optionD;
        return attribute == null ? getWrapped().<String>get("optionD") : getWrapped().get(attribute);
    }

    public SubjectSummaryViewRelation<T, MethodSingularAttribute<QuestionView, SubjectSummaryView>> subject() {
        SubjectSummaryViewRelation<QuestionView, MethodSingularAttribute<QuestionView, SubjectSummaryView>> relation = QuestionView_.subject;
        return new SubjectSummaryViewRelation<>(relation == null ? getWrapped().<SubjectSummaryView>get("subject") : getWrapped().get(relation));
    }

    public AttributePath<T, String, String> text() {
        MethodSingularAttribute<QuestionView, String> attribute = QuestionView_.text;
        return attribute == null ? getWrapped().<String>get("text") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

