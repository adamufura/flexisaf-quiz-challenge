package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import com.flexisaf.flexisafquiz.model.Role;
import com.flexisaf.flexisafquiz.model.User;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(UserView.class)
public class UserViewImpl implements UserView, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(UserViewImpl.class, ENTITY_VIEW_MANAGER);

    private final String email;
    private final String firstname;
    private final UUID id;
    private final String lastname;
    private final String phonenumber;
    private final Role role;

    public UserViewImpl(UserViewImpl noop, Map<String, Object> blazePersistenceOptionalParameters) {
        this.email = null;
        this.firstname = null;
        this.id = null;
        this.lastname = null;
        this.phonenumber = null;
        this.role = null;
    }

    public UserViewImpl(        UUID id) {
        this.$$_kind = (byte) 1;
        this.email = null;
        this.firstname = null;
        this.id = id;
        this.lastname = null;
        this.phonenumber = null;
        this.role = null;
    }

    public UserViewImpl(
        UUID id,
        String email,
        String firstname,
        String lastname,
        String phonenumber,
        Role role
    ) {
        super();
        this.email = email;
        this.firstname = firstname;
        this.id = id;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.role = role;
    }

    public UserViewImpl(UserViewImpl noop, int offset, Object[] tuple) {
        super();
        this.email = (String) tuple[offset + 1];
        this.firstname = (String) tuple[offset + 2];
        this.id = (UUID) tuple[offset + 0];
        this.lastname = (String) tuple[offset + 3];
        this.phonenumber = (String) tuple[offset + 4];
        this.role = (Role) tuple[offset + 5];
    }

    public UserViewImpl(UserViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this.email = (String) tuple[offset + assignment[1]];
        this.firstname = (String) tuple[offset + assignment[2]];
        this.id = (UUID) tuple[offset + assignment[0]];
        this.lastname = (String) tuple[offset + assignment[3]];
        this.phonenumber = (String) tuple[offset + assignment[4]];
        this.role = (Role) tuple[offset + assignment[5]];
    }


    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public String getFirstname() {
        return firstname;
    }
    @Override
    public UUID getId() {
        return id;
    }
    @Override
    public String getLastname() {
        return lastname;
    }
    @Override
    public String getPhonenumber() {
        return phonenumber;
    }
    @Override
    public Role getRole() {
        return role;
    }


    private byte $$_kind;

    @Override
    public Class<?> $$_getJpaManagedClass() {
        return User.class;
    }
    @Override
    public Class<?> $$_getJpaManagedBaseClass() {
        return User.class;
    }
    @Override
    public Class<?> $$_getEntityViewClass() {
        return UserView.class;
    }
    @Override
    public boolean $$_isNew() {
        return false;
    }
    @Override
    public boolean $$_isReference() {
        return $$_kind == (byte) 1;
    }
    @Override
    public void $$_setIsReference(boolean isReference) {
        if (isReference) {
            this.$$_kind = (byte) 1;
        } else {
            this.$$_kind = (byte) 0;
        }
    }
    @Override
    public Object $$_getId() {
        return id;
    }
    @Override
    public Object $$_getVersion() {
        return null;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.$$_getId() == null) {
            return false;
        }
        if (obj instanceof EntityViewProxy) {
            EntityViewProxy other = (EntityViewProxy) obj;
            if (this.$$_getJpaManagedBaseClass() == other.$$_getJpaManagedBaseClass() && this.$$_getId().equals(other.$$_getId())) {
                return true;
            } else {
                return false;
            }
        }
        if (obj instanceof UserView) {
            UserView other = (UserView) obj;
            if (!Objects.equals(this.id, other.getId())) {
                return false;
            }
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        long bits;
        int hash = 3;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
    @Override
    public String toString() {
        return "UserView(id = " + this.id + ")";
    }
}

