package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewBuilder;
import com.blazebit.persistence.view.EntityViewBuilderBase;
import com.blazebit.persistence.view.EntityViewBuilderListener;
import com.blazebit.persistence.view.EntityViewNestedBuilder;
import com.blazebit.persistence.view.RecordingContainer;
import com.blazebit.persistence.view.StaticBuilder;
import com.blazebit.persistence.view.metamodel.Attribute;
import com.blazebit.persistence.view.metamodel.CollectionAttribute;
import com.blazebit.persistence.view.metamodel.ListAttribute;
import com.blazebit.persistence.view.metamodel.MapAttribute;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.ParameterAttribute;
import com.blazebit.persistence.view.metamodel.PluralAttribute;
import com.blazebit.persistence.view.metamodel.SetAttribute;
import com.blazebit.persistence.view.metamodel.SingularAttribute;
import com.flexisaf.flexisafquiz.model.Role;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticBuilder(UserView.class)
public abstract class UserViewBuilder<BuilderType extends EntityViewBuilderBase<UserView, BuilderType>> implements EntityViewBuilderBase<UserView, BuilderType> {

    protected String email;
    protected String firstname;
    protected UUID id;
    protected String lastname;
    protected String phonenumber;
    protected Role role;
    protected final Map<String, Object> blazePersistenceOptionalParameters;

    public UserViewBuilder(Map<String, Object> blazePersistenceOptionalParameters) {
        this.email = null;
        this.firstname = null;
        this.id = null;
        this.lastname = null;
        this.phonenumber = null;
        this.role = null;
        this.blazePersistenceOptionalParameters = blazePersistenceOptionalParameters;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BuilderType withEmail(String email) {
        this.email = email;
        return (BuilderType) this;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public BuilderType withFirstname(String firstname) {
        this.firstname = firstname;
        return (BuilderType) this;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public BuilderType withId(UUID id) {
        this.id = id;
        return (BuilderType) this;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public BuilderType withLastname(String lastname) {
        this.lastname = lastname;
        return (BuilderType) this;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public BuilderType withPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return (BuilderType) this;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public BuilderType withRole(Role role) {
        this.role = role;
        return (BuilderType) this;
    }

    protected <ElementType> ElementType get(Attribute<?, ?> attr) {
        if (attr instanceof MethodAttribute) {
            return get(((MethodAttribute) attr).getName());
        } else {
            return get(((ParameterAttribute) attr).getIndex());
        }
    }

    protected <CollectionType extends Collection<Object>> CollectionType getCollection(Attribute<?, ?> attr) {
        if (attr instanceof MethodAttribute) {
            return getCollection(((MethodAttribute) attr).getName());
        } else {
            return getCollection(((ParameterAttribute) attr).getIndex());
        }
    }

    protected <CollectionType extends Map<Object, Object>> CollectionType getMap(Attribute<?, ?> attr) {
        if (attr instanceof MethodAttribute) {
            return getMap(((MethodAttribute) attr).getName());
        } else {
            return getMap(((ParameterAttribute) attr).getIndex());
        }
    }

    protected <CollectionType extends Collection<Object>> CollectionType getCollection(String attr) {
        Object currentValue = get(attr);
        if (currentValue == null) {
            with(attr, null);
            currentValue = get(attr);
        }
        if (currentValue instanceof RecordingContainer<?>) {
            return (CollectionType) ((RecordingContainer<?>) currentValue).getDelegate();
        } else {
            return (CollectionType) currentValue;
        }
    }

    protected <CollectionType extends Map<Object, Object>> CollectionType getMap(String attr) {
        Object currentValue = get(attr);
        if (currentValue == null) {
            with(attr, null);
            currentValue = get(attr);
        }
        if (currentValue instanceof RecordingContainer<?>) {
            return (CollectionType) ((RecordingContainer<?>) currentValue).getDelegate();
        } else {
            return (CollectionType) currentValue;
        }
    }

    protected <CollectionType extends Collection<Object>> CollectionType getCollection(int attr) {
        Object currentValue = get(attr);
        if (currentValue == null) {
            with(attr, null);
            currentValue = get(attr);
        }
        if (currentValue instanceof RecordingContainer<?>) {
            return (CollectionType) ((RecordingContainer<?>) currentValue).getDelegate();
        } else {
            return (CollectionType) currentValue;
        }
    }

    protected <CollectionType extends Map<Object, Object>> CollectionType getMap(int attr) {
        Object currentValue = get(attr);
        if (currentValue == null) {
            with(attr, null);
            currentValue = get(attr);
        }
        if (currentValue instanceof RecordingContainer<?>) {
            return (CollectionType) ((RecordingContainer<?>) currentValue).getDelegate();
        } else {
            return (CollectionType) currentValue;
        }
    }

    protected void addListValue(List<Object> list, int index, Object value) {
        if (index > list.size()) {
            for (int i = list.size(); i < index; i++) {
                list.add(null);
            }
            list.add(value);
        } else if (index < list.size()) {
            list.set(index, value);
        } else {
            list.add(value);
        }
    }

    @Override
    public <ElementType> ElementType get(String attribute) {
        switch (attribute) {
            case "email":
                return (ElementType) (Object) this.email;
            case "firstname":
                return (ElementType) (Object) this.firstname;
            case "id":
                return (ElementType) (Object) this.id;
            case "lastname":
                return (ElementType) (Object) this.lastname;
            case "phonenumber":
                return (ElementType) (Object) this.phonenumber;
            case "role":
                return (ElementType) (Object) this.role;
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> ElementType get(SingularAttribute<UserView, ElementType> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public <CollectionType> CollectionType get(PluralAttribute<UserView, CollectionType, ?> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public BuilderType with(String attribute, Object value) {
        switch (attribute) {
            case "email":
                this.email = value == null ? null : (String) value;
                break;
            case "firstname":
                this.firstname = value == null ? null : (String) value;
                break;
            case "id":
                this.id = value == null ? null : (UUID) value;
                break;
            case "lastname":
                this.lastname = value == null ? null : (String) value;
                break;
            case "phonenumber":
                this.phonenumber = value == null ? null : (String) value;
                break;
            case "role":
                this.role = value == null ? null : (Role) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType with(SingularAttribute<UserView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> BuilderType with(PluralAttribute<UserView, CollectionType, ?> attribute, CollectionType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public BuilderType withElement(String attribute, Object value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withElement(int parameterIndex, Object value) {
        getCollection(parameterIndex).add(value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withListElement(String attribute, int index, Object value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withListElement(int parameterIndex, int index, Object value) {
        List<Object> list = getCollection(parameterIndex);
        addListValue(list, index, value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withEntry(String attribute, Object key, Object value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withEntry(int parameterIndex, Object key, Object value) {
        Map<Object, Object> map = getMap(parameterIndex);
        map.put(key, value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withElement(CollectionAttribute<UserView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withElement(SetAttribute<UserView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withElement(ListAttribute<UserView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withListElement(ListAttribute<UserView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (BuilderType) this;
    }

    @Override
    public <KeyType, ElementType> BuilderType withEntry(MapAttribute<UserView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withSingularBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withCollectionBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withListBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withListBuilder(String attribute, int index) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withSetBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withMapBuilder(String attribute, Object key) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>, ?> withMapBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(SingularAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(CollectionAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(ListAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(ListAttribute<UserView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(SetAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(MapAttribute<UserView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>, ?> withBuilder(MapAttribute<UserView, KeyType, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName());
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex());
        }
    }


    public static class Init extends UserViewBuilder<EntityViewBuilder<UserView>> implements EntityViewBuilder<UserView> {

        public Init(Map<String, Object> blazePersistenceOptionalParameters) {
            super(blazePersistenceOptionalParameters);
        }

        @Override
        public UserView build() {
            return new UserViewImpl(
            this.id,
            this.email,
            this.firstname,
            this.lastname,
            this.phonenumber,
            this.role
            );
        }

        @Override
        public Init with(int parameterIndex, Object value) {
            switch (parameterIndex) {
                default:
                     throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
        }
    }

        @Override
        public <ElementType> ElementType get(int parameterIndex) {
            switch (parameterIndex) {
            }
            throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
        }
    public Init withEmail(String email) {
        this.email = email;
        return (Init) this;
    }
    public Init withFirstname(String firstname) {
        this.firstname = firstname;
        return (Init) this;
    }
    public Init withId(UUID id) {
        this.id = id;
        return (Init) this;
    }
    public Init withLastname(String lastname) {
        this.lastname = lastname;
        return (Init) this;
    }
    public Init withPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return (Init) this;
    }
    public Init withRole(Role role) {
        this.role = role;
        return (Init) this;
    }

    @Override
    public Init with(String attribute, Object value) {
        switch (attribute) {
            case "email":
                this.email = value == null ? null : (String) value;
                break;
            case "firstname":
                this.firstname = value == null ? null : (String) value;
                break;
            case "id":
                this.id = value == null ? null : (UUID) value;
                break;
            case "lastname":
                this.lastname = value == null ? null : (String) value;
                break;
            case "phonenumber":
                this.phonenumber = value == null ? null : (String) value;
                break;
            case "role":
                this.role = value == null ? null : (Role) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (Init) this;
    }

    @Override
    public <ElementType> Init with(SingularAttribute<UserView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> Init with(PluralAttribute<UserView, CollectionType, ?> attribute, CollectionType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public Init withElement(String attribute, Object value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public Init withElement(int parameterIndex, Object value) {
        getCollection(parameterIndex).add(value);
        return (Init) this;
    }

    @Override
    public Init withListElement(String attribute, int index, Object value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Init) this;
    }

    @Override
    public Init withListElement(int parameterIndex, int index, Object value) {
        List<Object> list = getCollection(parameterIndex);
        addListValue(list, index, value);
        return (Init) this;
    }

    @Override
    public Init withEntry(String attribute, Object key, Object value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (Init) this;
    }

    @Override
    public Init withEntry(int parameterIndex, Object key, Object value) {
        Map<Object, Object> map = getMap(parameterIndex);
        map.put(key, value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withElement(CollectionAttribute<UserView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withElement(SetAttribute<UserView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withElement(ListAttribute<UserView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withListElement(ListAttribute<UserView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Init) this;
    }

    @Override
    public <KeyType, ElementType> Init withEntry(MapAttribute<UserView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (Init) this;
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withSingularBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withCollectionBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withListBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withListBuilder(String attribute, int index) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withSetBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withMapBuilder(String attribute, Object key) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Init, ?>, ?> withMapBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(SingularAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(CollectionAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(ListAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(ListAttribute<UserView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(SetAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(MapAttribute<UserView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Init, ?>, ?> withBuilder(MapAttribute<UserView, KeyType, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName());
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withSingularBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withCollectionBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withListBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withListBuilder(int parameterIndex, int index) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withSetBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withMapBuilder(int parameterIndex, Object key) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Init, ?>, ?> withMapBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }
    }

    public static class Nested<BuilderResult> extends UserViewBuilder<Nested<BuilderResult>> implements EntityViewNestedBuilder<UserView, BuilderResult, Nested<BuilderResult>> {

        private final EntityViewBuilderListener blazePersistenceListener;
        private final BuilderResult blazePersistenceResult;

        public Nested(Map<String, Object> blazePersistenceOptionalParameters, EntityViewBuilderListener blazePersistenceListener, BuilderResult blazePersistenceResult) {
            super(blazePersistenceOptionalParameters);
            this.blazePersistenceListener = blazePersistenceListener;
            this.blazePersistenceResult = blazePersistenceResult;
        }

        @Override
        public BuilderResult build() {
            blazePersistenceListener.onBuildComplete(new UserViewImpl(
            this.id,
            this.email,
            this.firstname,
            this.lastname,
            this.phonenumber,
            this.role
            ));
            return blazePersistenceResult;
        }

        @Override
        public Nested<BuilderResult> with(int parameterIndex, Object value) {
        switch (parameterIndex) {
            default:
                throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
        }
    }

        @Override
        public <ElementType> ElementType get(int parameterIndex) {
            switch (parameterIndex) {
            }
            throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
        }
    public Nested<BuilderResult> withEmail(String email) {
        this.email = email;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withFirstname(String firstname) {
        this.firstname = firstname;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withId(UUID id) {
        this.id = id;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withLastname(String lastname) {
        this.lastname = lastname;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withRole(Role role) {
        this.role = role;
        return (Nested<BuilderResult>) this;
    }

    @Override
    public Nested<BuilderResult> with(String attribute, Object value) {
        switch (attribute) {
            case "email":
                this.email = value == null ? null : (String) value;
                break;
            case "firstname":
                this.firstname = value == null ? null : (String) value;
                break;
            case "id":
                this.id = value == null ? null : (UUID) value;
                break;
            case "lastname":
                this.lastname = value == null ? null : (String) value;
                break;
            case "phonenumber":
                this.phonenumber = value == null ? null : (String) value;
                break;
            case "role":
                this.role = value == null ? null : (Role) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> with(SingularAttribute<UserView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> Nested<BuilderResult> with(PluralAttribute<UserView, CollectionType, ?> attribute, CollectionType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public Nested<BuilderResult> withElement(String attribute, Object value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public Nested<BuilderResult> withElement(int parameterIndex, Object value) {
        getCollection(parameterIndex).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public Nested<BuilderResult> withListElement(String attribute, int index, Object value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public Nested<BuilderResult> withListElement(int parameterIndex, int index, Object value) {
        List<Object> list = getCollection(parameterIndex);
        addListValue(list, index, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public Nested<BuilderResult> withEntry(String attribute, Object key, Object value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public Nested<BuilderResult> withEntry(int parameterIndex, Object key, Object value) {
        Map<Object, Object> map = getMap(parameterIndex);
        map.put(key, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withElement(CollectionAttribute<UserView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withElement(SetAttribute<UserView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withElement(ListAttribute<UserView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withListElement(ListAttribute<UserView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <KeyType, ElementType> Nested<BuilderResult> withEntry(MapAttribute<UserView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withSingularBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withCollectionBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withListBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withListBuilder(String attribute, int index) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withSetBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withMapBuilder(String attribute, Object key) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>, ?> withMapBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(SingularAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(CollectionAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(ListAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(ListAttribute<UserView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(SetAttribute<UserView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(MapAttribute<UserView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>, ?> withBuilder(MapAttribute<UserView, KeyType, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName());
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withSingularBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withCollectionBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withListBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withListBuilder(int parameterIndex, int index) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withSetBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withMapBuilder(int parameterIndex, Object key) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>, ?> withMapBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }
    }
}

