package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodListAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(ExamView.class)
public class ExamViewRelation<T, A extends MethodAttribute<?, ?>> extends AttributePathWrapper<T, ExamView, ExamView> {

    public ExamViewRelation(AttributePath<T, ExamView, ExamView> path) {
        super(path);
    }

    public ExamQuestionViewRelation<T, MethodListAttribute<ExamView, ExamQuestionView>> examQuestions() {
        ExamQuestionViewRelation<ExamView, MethodListAttribute<ExamView, ExamQuestionView>> relation = ExamView_.examQuestions;
        return new ExamQuestionViewRelation<>(relation == null ? getWrapped().<ExamQuestionView>get("examQuestions") : getWrapped().get(relation));
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<ExamView, Long> attribute = ExamView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public QuizViewRelation<T, MethodSingularAttribute<ExamView, QuizView>> quiz() {
        QuizViewRelation<ExamView, MethodSingularAttribute<ExamView, QuizView>> relation = ExamView_.quiz;
        return new QuizViewRelation<>(relation == null ? getWrapped().<QuizView>get("quiz") : getWrapped().get(relation));
    }

    public AttributePath<T, UUID, UUID> studentId() {
        MethodSingularAttribute<ExamView, UUID> attribute = ExamView_.studentId;
        return attribute == null ? getWrapped().<UUID>get("studentId") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

