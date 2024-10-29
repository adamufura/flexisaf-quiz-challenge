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
import com.flexisaf.flexisafquiz.model.DifficultyType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticBuilder(QuizQuestionView.class)
public abstract class QuizQuestionViewBuilder<BuilderType extends EntityViewBuilderBase<QuizQuestionView, BuilderType>> implements EntityViewBuilderBase<QuizQuestionView, BuilderType> {

    protected String correctOption;
    protected DifficultyType difficulty;
    protected Long id;
    protected String optionA;
    protected String optionB;
    protected String optionC;
    protected String optionD;
    protected String text;
    protected final Map<String, Object> blazePersistenceOptionalParameters;

    public QuizQuestionViewBuilder(Map<String, Object> blazePersistenceOptionalParameters) {
        this.correctOption = null;
        this.difficulty = null;
        this.id = null;
        this.optionA = null;
        this.optionB = null;
        this.optionC = null;
        this.optionD = null;
        this.text = null;
        this.blazePersistenceOptionalParameters = blazePersistenceOptionalParameters;
    }

    public String getCorrectOption() {
        return correctOption;
    }
    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }
    public BuilderType withCorrectOption(String correctOption) {
        this.correctOption = correctOption;
        return (BuilderType) this;
    }
    public DifficultyType getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(DifficultyType difficulty) {
        this.difficulty = difficulty;
    }
    public BuilderType withDifficulty(DifficultyType difficulty) {
        this.difficulty = difficulty;
        return (BuilderType) this;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public BuilderType withId(Long id) {
        this.id = id;
        return (BuilderType) this;
    }
    public String getOptionA() {
        return optionA;
    }
    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }
    public BuilderType withOptionA(String optionA) {
        this.optionA = optionA;
        return (BuilderType) this;
    }
    public String getOptionB() {
        return optionB;
    }
    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }
    public BuilderType withOptionB(String optionB) {
        this.optionB = optionB;
        return (BuilderType) this;
    }
    public String getOptionC() {
        return optionC;
    }
    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }
    public BuilderType withOptionC(String optionC) {
        this.optionC = optionC;
        return (BuilderType) this;
    }
    public String getOptionD() {
        return optionD;
    }
    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }
    public BuilderType withOptionD(String optionD) {
        this.optionD = optionD;
        return (BuilderType) this;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public BuilderType withText(String text) {
        this.text = text;
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
            case "correctOption":
                return (ElementType) (Object) this.correctOption;
            case "difficulty":
                return (ElementType) (Object) this.difficulty;
            case "id":
                return (ElementType) (Object) this.id;
            case "optionA":
                return (ElementType) (Object) this.optionA;
            case "optionB":
                return (ElementType) (Object) this.optionB;
            case "optionC":
                return (ElementType) (Object) this.optionC;
            case "optionD":
                return (ElementType) (Object) this.optionD;
            case "text":
                return (ElementType) (Object) this.text;
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> ElementType get(SingularAttribute<QuizQuestionView, ElementType> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public <CollectionType> CollectionType get(PluralAttribute<QuizQuestionView, CollectionType, ?> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public BuilderType with(String attribute, Object value) {
        switch (attribute) {
            case "correctOption":
                this.correctOption = value == null ? null : (String) value;
                break;
            case "difficulty":
                this.difficulty = value == null ? null : (DifficultyType) value;
                break;
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            case "optionA":
                this.optionA = value == null ? null : (String) value;
                break;
            case "optionB":
                this.optionB = value == null ? null : (String) value;
                break;
            case "optionC":
                this.optionC = value == null ? null : (String) value;
                break;
            case "optionD":
                this.optionD = value == null ? null : (String) value;
                break;
            case "text":
                this.text = value == null ? null : (String) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType with(SingularAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> BuilderType with(PluralAttribute<QuizQuestionView, CollectionType, ?> attribute, CollectionType value) {
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
    public <ElementType> BuilderType withElement(CollectionAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withElement(SetAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withElement(ListAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withListElement(ListAttribute<QuizQuestionView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (BuilderType) this;
    }

    @Override
    public <KeyType, ElementType> BuilderType withEntry(MapAttribute<QuizQuestionView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
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
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(SingularAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(CollectionAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(ListAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(ListAttribute<QuizQuestionView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(SetAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(MapAttribute<QuizQuestionView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>, ?> withBuilder(MapAttribute<QuizQuestionView, KeyType, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName());
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex());
        }
    }


    public static class Init extends QuizQuestionViewBuilder<EntityViewBuilder<QuizQuestionView>> implements EntityViewBuilder<QuizQuestionView> {

        public Init(Map<String, Object> blazePersistenceOptionalParameters) {
            super(blazePersistenceOptionalParameters);
        }

        @Override
        public QuizQuestionView build() {
            return new QuizQuestionViewImpl(
            this.id,
            this.correctOption,
            this.difficulty,
            this.optionA,
            this.optionB,
            this.optionC,
            this.optionD,
            this.text
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
    public Init withCorrectOption(String correctOption) {
        this.correctOption = correctOption;
        return (Init) this;
    }
    public Init withDifficulty(DifficultyType difficulty) {
        this.difficulty = difficulty;
        return (Init) this;
    }
    public Init withId(Long id) {
        this.id = id;
        return (Init) this;
    }
    public Init withOptionA(String optionA) {
        this.optionA = optionA;
        return (Init) this;
    }
    public Init withOptionB(String optionB) {
        this.optionB = optionB;
        return (Init) this;
    }
    public Init withOptionC(String optionC) {
        this.optionC = optionC;
        return (Init) this;
    }
    public Init withOptionD(String optionD) {
        this.optionD = optionD;
        return (Init) this;
    }
    public Init withText(String text) {
        this.text = text;
        return (Init) this;
    }

    @Override
    public Init with(String attribute, Object value) {
        switch (attribute) {
            case "correctOption":
                this.correctOption = value == null ? null : (String) value;
                break;
            case "difficulty":
                this.difficulty = value == null ? null : (DifficultyType) value;
                break;
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            case "optionA":
                this.optionA = value == null ? null : (String) value;
                break;
            case "optionB":
                this.optionB = value == null ? null : (String) value;
                break;
            case "optionC":
                this.optionC = value == null ? null : (String) value;
                break;
            case "optionD":
                this.optionD = value == null ? null : (String) value;
                break;
            case "text":
                this.text = value == null ? null : (String) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (Init) this;
    }

    @Override
    public <ElementType> Init with(SingularAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> Init with(PluralAttribute<QuizQuestionView, CollectionType, ?> attribute, CollectionType value) {
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
    public <ElementType> Init withElement(CollectionAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withElement(SetAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withElement(ListAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withListElement(ListAttribute<QuizQuestionView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Init) this;
    }

    @Override
    public <KeyType, ElementType> Init withEntry(MapAttribute<QuizQuestionView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
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
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(SingularAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(CollectionAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(ListAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(ListAttribute<QuizQuestionView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(SetAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(MapAttribute<QuizQuestionView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Init, ?>, ?> withBuilder(MapAttribute<QuizQuestionView, KeyType, ElementType> attr) {
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

    public static class Nested<BuilderResult> extends QuizQuestionViewBuilder<Nested<BuilderResult>> implements EntityViewNestedBuilder<QuizQuestionView, BuilderResult, Nested<BuilderResult>> {

        private final EntityViewBuilderListener blazePersistenceListener;
        private final BuilderResult blazePersistenceResult;

        public Nested(Map<String, Object> blazePersistenceOptionalParameters, EntityViewBuilderListener blazePersistenceListener, BuilderResult blazePersistenceResult) {
            super(blazePersistenceOptionalParameters);
            this.blazePersistenceListener = blazePersistenceListener;
            this.blazePersistenceResult = blazePersistenceResult;
        }

        @Override
        public BuilderResult build() {
            blazePersistenceListener.onBuildComplete(new QuizQuestionViewImpl(
            this.id,
            this.correctOption,
            this.difficulty,
            this.optionA,
            this.optionB,
            this.optionC,
            this.optionD,
            this.text
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
    public Nested<BuilderResult> withCorrectOption(String correctOption) {
        this.correctOption = correctOption;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withDifficulty(DifficultyType difficulty) {
        this.difficulty = difficulty;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withId(Long id) {
        this.id = id;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withOptionA(String optionA) {
        this.optionA = optionA;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withOptionB(String optionB) {
        this.optionB = optionB;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withOptionC(String optionC) {
        this.optionC = optionC;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withOptionD(String optionD) {
        this.optionD = optionD;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withText(String text) {
        this.text = text;
        return (Nested<BuilderResult>) this;
    }

    @Override
    public Nested<BuilderResult> with(String attribute, Object value) {
        switch (attribute) {
            case "correctOption":
                this.correctOption = value == null ? null : (String) value;
                break;
            case "difficulty":
                this.difficulty = value == null ? null : (DifficultyType) value;
                break;
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            case "optionA":
                this.optionA = value == null ? null : (String) value;
                break;
            case "optionB":
                this.optionB = value == null ? null : (String) value;
                break;
            case "optionC":
                this.optionC = value == null ? null : (String) value;
                break;
            case "optionD":
                this.optionD = value == null ? null : (String) value;
                break;
            case "text":
                this.text = value == null ? null : (String) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> with(SingularAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> Nested<BuilderResult> with(PluralAttribute<QuizQuestionView, CollectionType, ?> attribute, CollectionType value) {
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
    public <ElementType> Nested<BuilderResult> withElement(CollectionAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withElement(SetAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withElement(ListAttribute<QuizQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withListElement(ListAttribute<QuizQuestionView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <KeyType, ElementType> Nested<BuilderResult> withEntry(MapAttribute<QuizQuestionView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
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
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(SingularAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(CollectionAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(ListAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(ListAttribute<QuizQuestionView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(SetAttribute<QuizQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(MapAttribute<QuizQuestionView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>, ?> withBuilder(MapAttribute<QuizQuestionView, KeyType, ElementType> attr) {
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

