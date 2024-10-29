package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.flexisaf.flexisafquiz.model.User;
import com.flexisaf.flexisafquiz.model.Role;

import java.util.UUID;

@EntityView(User.class)
public interface UserView {

    @IdMapping
    UUID getId();

    String getFirstname();

    String getLastname();

    String getEmail();

    String getPhonenumber();

    Role getRole();
}
