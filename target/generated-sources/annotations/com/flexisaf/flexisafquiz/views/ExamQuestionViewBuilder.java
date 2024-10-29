package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewBuilder;
import com.blazebit.persistence.view.EntityViewBuilderBase;
import com.blazebit.persistence.view.EntityViewBuilderListener;
import com.blazebit.persistence.view.EntityViewNestedBuilder;
import com.blazebit.persistence.view.RecordingContainer;
import com.blazebit.persistence.view.SingularNameEntityViewBuilderListener;
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
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticBuilder(ExamQuestionView.class)
public abstract class ExamQuestionViewBuilder<BuilderType extends EntityViewBuilderBase<ExamQuestionView, BuilderType>> implements EntityViewBuilderBase<ExamQuestionView, BuilderType> {

    protected boolean correct;
    protected Long id;
    protected QuestionView question;
    protected String selectedOption;
    protected final Map<String, Object> blazePersistenceOptionalParameters;

    public ExamQuestionViewBuilder(Map<String, Object> blazePersistenceOptionalParameters) {
        this.correct = false;
        this.id = null;
        this.question = null;
        this.selectedOption = null;
        this.blazePersistenceOptionalParameters = blazePersistenceOptionalParameters;
    }

    public boolean getCorrect() {
        return correct;
    }
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
    public BuilderType withCorrect(boolean correct) {
        this.correct = correct;
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
    public QuestionView getQuestion() {
        return question;
    }
    public void setQuestion(QuestionView question) {
        this.question = question;
    }
    public BuilderType withQuestion(QuestionView question) {
        this.question = question;
        return (BuilderType) this;
    }
    public QuestionViewBuilder.Nested<? extends BuilderType> withQuestionBuilder() {
    return new QuestionViewBuilder.Nested<>(blazePersistenceOptionalParameters, new SingularNameEntityViewBuilderListener(this, "question"), (BuilderType) this);
    }

    public String getSelectedOption() {
        return selectedOption;
    }
    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
    public BuilderType withSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
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
            case "correct":
                return (ElementType) (Object) this.correct;
            case "id":
                return (ElementType) (Object) this.id;
            case "question":
                return (ElementType) (Object) this.question;
            case "selectedOption":
                return (ElementType) (Object) this.selectedOption;
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> ElementType get(SingularAttribute<ExamQuestionView, ElementType> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public <CollectionType> CollectionType get(PluralAttribute<ExamQuestionView, CollectionType, ?> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public BuilderType with(String attribute, Object value) {
        switch (attribute) {
            case "correct":
                this.correct = value == null ? false : (boolean) value;
                break;
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            case "question":
                this.question = value == null ? null : (QuestionView) value;
                break;
            case "selectedOption":
                this.selectedOption = value == null ? null : (String) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType with(SingularAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> BuilderType with(PluralAttribute<ExamQuestionView, CollectionType, ?> attribute, CollectionType value) {
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
    public <ElementType> BuilderType withElement(CollectionAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withElement(SetAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withElement(ListAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withListElement(ListAttribute<ExamQuestionView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (BuilderType) this;
    }

    @Override
    public <KeyType, ElementType> BuilderType withEntry(MapAttribute<ExamQuestionView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withSingularBuilder(String attribute) {
        switch (attribute) {
            case "question":
                return (EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>) (EntityViewNestedBuilder<?, ?, ?>) withQuestionBuilder();
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
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(SingularAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(CollectionAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(ListAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(ListAttribute<ExamQuestionView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(SetAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(MapAttribute<ExamQuestionView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>, ?> withBuilder(MapAttribute<ExamQuestionView, KeyType, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName());
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex());
        }
    }


    public static class Init extends ExamQuestionViewBuilder<EntityViewBuilder<ExamQuestionView>> implements EntityViewBuilder<ExamQuestionView> {

        public Init(Map<String, Object> blazePersistenceOptionalParameters) {
            super(blazePersistenceOptionalParameters);
        }

        @Override
        public ExamQuestionView build() {
            return new ExamQuestionViewImpl(
            this.id,
            this.correct,
            this.question,
            this.selectedOption
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
    public Init withCorrect(boolean correct) {
        this.correct = correct;
        return (Init) this;
    }
    public Init withId(Long id) {
        this.id = id;
        return (Init) this;
    }
    public Init withQuestion(QuestionView question) {
        this.question = question;
        return (Init) this;
    }
    public QuestionViewBuilder.Nested<? extends Init> withQuestionBuilder() {
    return new QuestionViewBuilder.Nested<>(blazePersistenceOptionalParameters, new SingularNameEntityViewBuilderListener(this, "question"), (Init) this);
    }

    public Init withSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
        return (Init) this;
    }

    @Override
    public Init with(String attribute, Object value) {
        switch (attribute) {
            case "correct":
                this.correct = value == null ? false : (boolean) value;
                break;
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            case "question":
                this.question = value == null ? null : (QuestionView) value;
                break;
            case "selectedOption":
                this.selectedOption = value == null ? null : (String) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (Init) this;
    }

    @Override
    public <ElementType> Init with(SingularAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> Init with(PluralAttribute<ExamQuestionView, CollectionType, ?> attribute, CollectionType value) {
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
    public <ElementType> Init withElement(CollectionAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withElement(SetAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withElement(ListAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withListElement(ListAttribute<ExamQuestionView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Init) this;
    }

    @Override
    public <KeyType, ElementType> Init withEntry(MapAttribute<ExamQuestionView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (Init) this;
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withSingularBuilder(String attribute) {
        switch (attribute) {
            case "question":
                return (EntityViewNestedBuilder<ElementType, ? extends Init, ?>) (EntityViewNestedBuilder<?, ?, ?>) withQuestionBuilder();
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
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(SingularAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(CollectionAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(ListAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(ListAttribute<ExamQuestionView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(SetAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(MapAttribute<ExamQuestionView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Init, ?>, ?> withBuilder(MapAttribute<ExamQuestionView, KeyType, ElementType> attr) {
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

    public static class Nested<BuilderResult> extends ExamQuestionViewBuilder<Nested<BuilderResult>> implements EntityViewNestedBuilder<ExamQuestionView, BuilderResult, Nested<BuilderResult>> {

        private final EntityViewBuilderListener blazePersistenceListener;
        private final BuilderResult blazePersistenceResult;

        public Nested(Map<String, Object> blazePersistenceOptionalParameters, EntityViewBuilderListener blazePersistenceListener, BuilderResult blazePersistenceResult) {
            super(blazePersistenceOptionalParameters);
            this.blazePersistenceListener = blazePersistenceListener;
            this.blazePersistenceResult = blazePersistenceResult;
        }

        @Override
        public BuilderResult build() {
            blazePersistenceListener.onBuildComplete(new ExamQuestionViewImpl(
            this.id,
            this.correct,
            this.question,
            this.selectedOption
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
    public Nested<BuilderResult> withCorrect(boolean correct) {
        this.correct = correct;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withId(Long id) {
        this.id = id;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withQuestion(QuestionView question) {
        this.question = question;
        return (Nested<BuilderResult>) this;
    }
    public QuestionViewBuilder.Nested<? extends Nested<BuilderResult>> withQuestionBuilder() {
    return new QuestionViewBuilder.Nested<>(blazePersistenceOptionalParameters, new SingularNameEntityViewBuilderListener(this, "question"), (Nested<BuilderResult>) this);
    }

    public Nested<BuilderResult> withSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
        return (Nested<BuilderResult>) this;
    }

    @Override
    public Nested<BuilderResult> with(String attribute, Object value) {
        switch (attribute) {
            case "correct":
                this.correct = value == null ? false : (boolean) value;
                break;
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            case "question":
                this.question = value == null ? null : (QuestionView) value;
                break;
            case "selectedOption":
                this.selectedOption = value == null ? null : (String) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> with(SingularAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> Nested<BuilderResult> with(PluralAttribute<ExamQuestionView, CollectionType, ?> attribute, CollectionType value) {
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
    public <ElementType> Nested<BuilderResult> withElement(CollectionAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withElement(SetAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withElement(ListAttribute<ExamQuestionView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withListElement(ListAttribute<ExamQuestionView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <KeyType, ElementType> Nested<BuilderResult> withEntry(MapAttribute<ExamQuestionView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withSingularBuilder(String attribute) {
        switch (attribute) {
            case "question":
                return (EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>) (EntityViewNestedBuilder<?, ?, ?>) withQuestionBuilder();
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
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(SingularAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(CollectionAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(ListAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(ListAttribute<ExamQuestionView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(SetAttribute<ExamQuestionView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(MapAttribute<ExamQuestionView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>, ?> withBuilder(MapAttribute<ExamQuestionView, KeyType, ElementType> attr) {
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

