package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodPluralAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import java.util.Collection;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(ExamQuestionView.class)
public class ExamQuestionViewMultiRelation<T, C extends Collection<ExamQuestionView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, ExamQuestionView, C> {

    public ExamQuestionViewMultiRelation(AttributePath<T, ExamQuestionView, C> path) {
        super(path);
    }

    public AttributePath<T, Boolean, Boolean> correct() {
        MethodSingularAttribute<ExamQuestionView, Boolean> attribute = ExamQuestionView_.correct;
        return attribute == null ? getWrapped().<Boolean>get("correct") : getWrapped().get(attribute);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<ExamQuestionView, Long> attribute = ExamQuestionView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public QuestionViewRelation<T, MethodSingularAttribute<ExamQuestionView, QuestionView>> question() {
        QuestionViewRelation<ExamQuestionView, MethodSingularAttribute<ExamQuestionView, QuestionView>> relation = ExamQuestionView_.question;
        return new QuestionViewRelation<>(relation == null ? getWrapped().<QuestionView>get("question") : getWrapped().get(relation));
    }

    public AttributePath<T, String, String> selectedOption() {
        MethodSingularAttribute<ExamQuestionView, String> attribute = ExamQuestionView_.selectedOption;
        return attribute == null ? getWrapped().<String>get("selectedOption") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

