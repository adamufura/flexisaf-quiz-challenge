package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodPluralAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import com.flexisaf.flexisafquiz.model.Role;
import java.util.Collection;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(UserView.class)
public class UserViewMultiRelation<T, C extends Collection<UserView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, UserView, C> {

    public UserViewMultiRelation(AttributePath<T, UserView, C> path) {
        super(path);
    }

    public AttributePath<T, String, String> email() {
        MethodSingularAttribute<UserView, String> attribute = UserView_.email;
        return attribute == null ? getWrapped().<String>get("email") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> firstname() {
        MethodSingularAttribute<UserView, String> attribute = UserView_.firstname;
        return attribute == null ? getWrapped().<String>get("firstname") : getWrapped().get(attribute);
    }

    public AttributePath<T, UUID, UUID> id() {
        MethodSingularAttribute<UserView, UUID> attribute = UserView_.id;
        return attribute == null ? getWrapped().<UUID>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> lastname() {
        MethodSingularAttribute<UserView, String> attribute = UserView_.lastname;
        return attribute == null ? getWrapped().<String>get("lastname") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> phonenumber() {
        MethodSingularAttribute<UserView, String> attribute = UserView_.phonenumber;
        return attribute == null ? getWrapped().<String>get("phonenumber") : getWrapped().get(attribute);
    }

    public AttributePath<T, Role, Role> role() {
        MethodSingularAttribute<UserView, Role> attribute = UserView_.role;
        return attribute == null ? getWrapped().<Role>get("role") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

