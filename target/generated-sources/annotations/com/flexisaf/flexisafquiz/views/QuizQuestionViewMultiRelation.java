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
@StaticRelation(QuizQuestionView.class)
public class QuizQuestionViewMultiRelation<T, C extends Collection<QuizQuestionView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, QuizQuestionView, C> {

    public QuizQuestionViewMultiRelation(AttributePath<T, QuizQuestionView, C> path) {
        super(path);
    }

    public AttributePath<T, String, String> correctOption() {
        MethodSingularAttribute<QuizQuestionView, String> attribute = QuizQuestionView_.correctOption;
        return attribute == null ? getWrapped().<String>get("correctOption") : getWrapped().get(attribute);
    }

    public AttributePath<T, DifficultyType, DifficultyType> difficulty() {
        MethodSingularAttribute<QuizQuestionView, DifficultyType> attribute = QuizQuestionView_.difficulty;
        return attribute == null ? getWrapped().<DifficultyType>get("difficulty") : getWrapped().get(attribute);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<QuizQuestionView, Long> attribute = QuizQuestionView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> optionA() {
        MethodSingularAttribute<QuizQuestionView, String> attribute = QuizQuestionView_.optionA;
        return attribute == null ? getWrapped().<String>get("optionA") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> optionB() {
        MethodSingularAttribute<QuizQuestionView, String> attribute = QuizQuestionView_.optionB;
        return attribute == null ? getWrapped().<String>get("optionB") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> optionC() {
        MethodSingularAttribute<QuizQuestionView, String> attribute = QuizQuestionView_.optionC;
        return attribute == null ? getWrapped().<String>get("optionC") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> optionD() {
        MethodSingularAttribute<QuizQuestionView, String> attribute = QuizQuestionView_.optionD;
        return attribute == null ? getWrapped().<String>get("optionD") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> text() {
        MethodSingularAttribute<QuizQuestionView, String> attribute = QuizQuestionView_.text;
        return attribute == null ? getWrapped().<String>get("text") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

