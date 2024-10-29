package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import com.flexisaf.flexisafquiz.model.Role;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(UserView.class)
public abstract class UserView_ {
    public static volatile MethodSingularAttribute<UserView, String> email;
    public static volatile MethodSingularAttribute<UserView, String> firstname;
    public static volatile MethodSingularAttribute<UserView, UUID> id;
    public static volatile MethodSingularAttribute<UserView, String> lastname;
    public static volatile MethodSingularAttribute<UserView, String> phonenumber;
    public static volatile MethodSingularAttribute<UserView, Role> role;

    public static final String EMAIL = "email";
    public static final String FIRSTNAME = "firstname";
    public static final String ID = "id";
    public static final String LASTNAME = "lastname";
    public static final String PHONENUMBER = "phonenumber";
    public static final String ROLE = "role";

    public static EntityViewSetting<UserView, CriteriaBuilder<UserView>> createSettingInit() {
        return EntityViewSetting.create(UserView.class, "init");
    }
    public static EntityViewSetting<UserView, PaginatedCriteriaBuilder<UserView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(UserView.class, firstResult, maxResults, "init");
    }

}

