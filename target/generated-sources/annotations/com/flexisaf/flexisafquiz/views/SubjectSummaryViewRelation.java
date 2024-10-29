package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(SubjectSummaryView.class)
public class SubjectSummaryViewRelation<T, A extends MethodAttribute<?, ?>> extends AttributePathWrapper<T, SubjectSummaryView, SubjectSummaryView> {

    public SubjectSummaryViewRelation(AttributePath<T, SubjectSummaryView, SubjectSummaryView> path) {
        super(path);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<SubjectSummaryView, Long> attribute = SubjectSummaryView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> name() {
        MethodSingularAttribute<SubjectSummaryView, String> attribute = SubjectSummaryView_.name;
        return attribute == null ? getWrapped().<String>get("name") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

