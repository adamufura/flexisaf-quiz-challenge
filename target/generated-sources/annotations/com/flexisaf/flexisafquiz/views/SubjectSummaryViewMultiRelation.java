package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodPluralAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import java.util.Collection;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(SubjectSummaryView.class)
public class SubjectSummaryViewMultiRelation<T, C extends Collection<SubjectSummaryView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, SubjectSummaryView, C> {

    public SubjectSummaryViewMultiRelation(AttributePath<T, SubjectSummaryView, C> path) {
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

