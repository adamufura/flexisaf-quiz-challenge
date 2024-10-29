package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.CollectionEntityViewBuilderListener;
import com.blazebit.persistence.view.EntityViewBuilder;
import com.blazebit.persistence.view.EntityViewBuilderBase;
import com.blazebit.persistence.view.EntityViewBuilderListener;
import com.blazebit.persistence.view.EntityViewNestedBuilder;
import com.blazebit.persistence.view.ListEntityViewBuilderListener;
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
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticBuilder(ExamView.class)
public abstract class ExamViewBuilder<BuilderType extends EntityViewBuilderBase<ExamView, BuilderType>> implements EntityViewBuilderBase<ExamView, BuilderType> {

    protected List<ExamQuestionView> examQuestions;
    protected Long id;
    protected QuizView quiz;
    protected UUID studentId;
    protected final Map<String, Object> blazePersistenceOptionalParameters;

    public ExamViewBuilder(Map<String, Object> blazePersistenceOptionalParameters) {
        this.examQuestions = (List<ExamQuestionView>) (java.util.List<?>) ExamView_.examQuestions.attr().getCollectionInstantiator().createCollection(0);
        this.id = null;
        this.quiz = null;
        this.studentId = null;
        this.blazePersistenceOptionalParameters = blazePersistenceOptionalParameters;
    }

    public List<ExamQuestionView> getExamQuestions() {
        return examQuestions;
    }
    public void setExamQuestions(List<ExamQuestionView> examQuestions) {
        this.examQuestions = examQuestions;
    }
    public BuilderType withExamQuestions(List<ExamQuestionView> examQuestions) {
        this.examQuestions = examQuestions;
        return (BuilderType) this;
    }
    public ExamQuestionViewBuilder.Nested<? extends BuilderType> withExamQuestionsBuilder(int index) {
        return new ExamQuestionViewBuilder.Nested<>(blazePersistenceOptionalParameters, new ListEntityViewBuilderListener(getCollection("examQuestions"), index), (BuilderType) this);
    }

    public ExamQuestionViewBuilder.Nested<? extends BuilderType> withExamQuestionsBuilder() {
    return new ExamQuestionViewBuilder.Nested<>(blazePersistenceOptionalParameters, new CollectionEntityViewBuilderListener(getCollection("examQuestions")), (BuilderType) this);
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
    public QuizView getQuiz() {
        return quiz;
    }
    public void setQuiz(QuizView quiz) {
        this.quiz = quiz;
    }
    public BuilderType withQuiz(QuizView quiz) {
        this.quiz = quiz;
        return (BuilderType) this;
    }
    public QuizViewBuilder.Nested<? extends BuilderType> withQuizBuilder() {
    return new QuizViewBuilder.Nested<>(blazePersistenceOptionalParameters, new SingularNameEntityViewBuilderListener(this, "quiz"), (BuilderType) this);
    }

    public UUID getStudentId() {
        return studentId;
    }
    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }
    public BuilderType withStudentId(UUID studentId) {
        this.studentId = studentId;
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
            case "examQuestions":
                return (ElementType) (Object) this.examQuestions;
            case "id":
                return (ElementType) (Object) this.id;
            case "quiz":
                return (ElementType) (Object) this.quiz;
            case "studentId":
                return (ElementType) (Object) this.studentId;
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> ElementType get(SingularAttribute<ExamView, ElementType> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public <CollectionType> CollectionType get(PluralAttribute<ExamView, CollectionType, ?> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public BuilderType with(String attribute, Object value) {
        switch (attribute) {
            case "examQuestions":
                this.examQuestions = value == null ? (List<ExamQuestionView>) (java.util.List<?>) ExamView_.examQuestions.attr().getCollectionInstantiator().createCollection(0) : (List<ExamQuestionView>) value;
                break;
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            case "quiz":
                this.quiz = value == null ? null : (QuizView) value;
                break;
            case "studentId":
                this.studentId = value == null ? null : (UUID) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType with(SingularAttribute<ExamView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> BuilderType with(PluralAttribute<ExamView, CollectionType, ?> attribute, CollectionType value) {
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
    public <ElementType> BuilderType withElement(CollectionAttribute<ExamView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withElement(SetAttribute<ExamView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withElement(ListAttribute<ExamView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> BuilderType withListElement(ListAttribute<ExamView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (BuilderType) this;
    }

    @Override
    public <KeyType, ElementType> BuilderType withEntry(MapAttribute<ExamView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (BuilderType) this;
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withSingularBuilder(String attribute) {
        switch (attribute) {
            case "quiz":
                return (EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>) (EntityViewNestedBuilder<?, ?, ?>) withQuizBuilder();
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withCollectionBuilder(String attribute) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder();
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withListBuilder(String attribute) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder();
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withListBuilder(String attribute, int index) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder(index);
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withSetBuilder(String attribute) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder();
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
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(SingularAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(CollectionAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(ListAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(ListAttribute<ExamView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(SetAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?> withBuilder(MapAttribute<ExamView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends BuilderType, ?>, ?> withBuilder(MapAttribute<ExamView, KeyType, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName());
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex());
        }
    }


    public static class Init extends ExamViewBuilder<EntityViewBuilder<ExamView>> implements EntityViewBuilder<ExamView> {

        public Init(Map<String, Object> blazePersistenceOptionalParameters) {
            super(blazePersistenceOptionalParameters);
        }

        @Override
        public ExamView build() {
            return new ExamViewImpl(
            this.id,
            this.examQuestions,
            this.quiz,
            this.studentId
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
    public Init withExamQuestions(List<ExamQuestionView> examQuestions) {
        this.examQuestions = examQuestions;
        return (Init) this;
    }
    public ExamQuestionViewBuilder.Nested<? extends Init> withExamQuestionsBuilder(int index) {
        return new ExamQuestionViewBuilder.Nested<>(blazePersistenceOptionalParameters, new ListEntityViewBuilderListener(getCollection("examQuestions"), index), (Init) this);
    }

    public ExamQuestionViewBuilder.Nested<? extends Init> withExamQuestionsBuilder() {
    return new ExamQuestionViewBuilder.Nested<>(blazePersistenceOptionalParameters, new CollectionEntityViewBuilderListener(getCollection("examQuestions")), (Init) this);
    }

    public Init withId(Long id) {
        this.id = id;
        return (Init) this;
    }
    public Init withQuiz(QuizView quiz) {
        this.quiz = quiz;
        return (Init) this;
    }
    public QuizViewBuilder.Nested<? extends Init> withQuizBuilder() {
    return new QuizViewBuilder.Nested<>(blazePersistenceOptionalParameters, new SingularNameEntityViewBuilderListener(this, "quiz"), (Init) this);
    }

    public Init withStudentId(UUID studentId) {
        this.studentId = studentId;
        return (Init) this;
    }

    @Override
    public Init with(String attribute, Object value) {
        switch (attribute) {
            case "examQuestions":
                this.examQuestions = value == null ? (List<ExamQuestionView>) (java.util.List<?>) ExamView_.examQuestions.attr().getCollectionInstantiator().createCollection(0) : (List<ExamQuestionView>) value;
                break;
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            case "quiz":
                this.quiz = value == null ? null : (QuizView) value;
                break;
            case "studentId":
                this.studentId = value == null ? null : (UUID) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (Init) this;
    }

    @Override
    public <ElementType> Init with(SingularAttribute<ExamView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> Init with(PluralAttribute<ExamView, CollectionType, ?> attribute, CollectionType value) {
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
    public <ElementType> Init withElement(CollectionAttribute<ExamView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withElement(SetAttribute<ExamView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withElement(ListAttribute<ExamView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Init) this;
    }

    @Override
    public <ElementType> Init withListElement(ListAttribute<ExamView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Init) this;
    }

    @Override
    public <KeyType, ElementType> Init withEntry(MapAttribute<ExamView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (Init) this;
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withSingularBuilder(String attribute) {
        switch (attribute) {
            case "quiz":
                return (EntityViewNestedBuilder<ElementType, ? extends Init, ?>) (EntityViewNestedBuilder<?, ?, ?>) withQuizBuilder();
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withCollectionBuilder(String attribute) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends Init, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder();
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withListBuilder(String attribute) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends Init, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder();
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withListBuilder(String attribute, int index) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends Init, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder(index);
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withSetBuilder(String attribute) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends Init, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder();
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
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(SingularAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(CollectionAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(ListAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(ListAttribute<ExamView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(SetAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends Init, ?> withBuilder(MapAttribute<ExamView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Init, ?>, ?> withBuilder(MapAttribute<ExamView, KeyType, ElementType> attr) {
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

    public static class Nested<BuilderResult> extends ExamViewBuilder<Nested<BuilderResult>> implements EntityViewNestedBuilder<ExamView, BuilderResult, Nested<BuilderResult>> {

        private final EntityViewBuilderListener blazePersistenceListener;
        private final BuilderResult blazePersistenceResult;

        public Nested(Map<String, Object> blazePersistenceOptionalParameters, EntityViewBuilderListener blazePersistenceListener, BuilderResult blazePersistenceResult) {
            super(blazePersistenceOptionalParameters);
            this.blazePersistenceListener = blazePersistenceListener;
            this.blazePersistenceResult = blazePersistenceResult;
        }

        @Override
        public BuilderResult build() {
            blazePersistenceListener.onBuildComplete(new ExamViewImpl(
            this.id,
            this.examQuestions,
            this.quiz,
            this.studentId
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
    public Nested<BuilderResult> withExamQuestions(List<ExamQuestionView> examQuestions) {
        this.examQuestions = examQuestions;
        return (Nested<BuilderResult>) this;
    }
    public ExamQuestionViewBuilder.Nested<? extends Nested<BuilderResult>> withExamQuestionsBuilder(int index) {
        return new ExamQuestionViewBuilder.Nested<>(blazePersistenceOptionalParameters, new ListEntityViewBuilderListener(getCollection("examQuestions"), index), (Nested<BuilderResult>) this);
    }

    public ExamQuestionViewBuilder.Nested<? extends Nested<BuilderResult>> withExamQuestionsBuilder() {
    return new ExamQuestionViewBuilder.Nested<>(blazePersistenceOptionalParameters, new CollectionEntityViewBuilderListener(getCollection("examQuestions")), (Nested<BuilderResult>) this);
    }

    public Nested<BuilderResult> withId(Long id) {
        this.id = id;
        return (Nested<BuilderResult>) this;
    }
    public Nested<BuilderResult> withQuiz(QuizView quiz) {
        this.quiz = quiz;
        return (Nested<BuilderResult>) this;
    }
    public QuizViewBuilder.Nested<? extends Nested<BuilderResult>> withQuizBuilder() {
    return new QuizViewBuilder.Nested<>(blazePersistenceOptionalParameters, new SingularNameEntityViewBuilderListener(this, "quiz"), (Nested<BuilderResult>) this);
    }

    public Nested<BuilderResult> withStudentId(UUID studentId) {
        this.studentId = studentId;
        return (Nested<BuilderResult>) this;
    }

    @Override
    public Nested<BuilderResult> with(String attribute, Object value) {
        switch (attribute) {
            case "examQuestions":
                this.examQuestions = value == null ? (List<ExamQuestionView>) (java.util.List<?>) ExamView_.examQuestions.attr().getCollectionInstantiator().createCollection(0) : (List<ExamQuestionView>) value;
                break;
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            case "quiz":
                this.quiz = value == null ? null : (QuizView) value;
                break;
            case "studentId":
                this.studentId = value == null ? null : (UUID) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> with(SingularAttribute<ExamView, ElementType> attribute, ElementType value) {
        if (attribute instanceof MethodAttribute) {
            return with(((MethodAttribute) attribute).getName(), value);
        } else {
            return with(((ParameterAttribute) attribute).getIndex(), value);
        }
    }

    @Override
    public <CollectionType> Nested<BuilderResult> with(PluralAttribute<ExamView, CollectionType, ?> attribute, CollectionType value) {
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
    public <ElementType> Nested<BuilderResult> withElement(CollectionAttribute<ExamView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withElement(SetAttribute<ExamView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withElement(ListAttribute<ExamView, ElementType> attribute, ElementType value) {
        getCollection(attribute).add(value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> Nested<BuilderResult> withListElement(ListAttribute<ExamView, ElementType> attribute, int index, ElementType value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <KeyType, ElementType> Nested<BuilderResult> withEntry(MapAttribute<ExamView, KeyType, ElementType> attribute, KeyType key, ElementType value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (Nested<BuilderResult>) this;
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withSingularBuilder(String attribute) {
        switch (attribute) {
            case "quiz":
                return (EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>) (EntityViewNestedBuilder<?, ?, ?>) withQuizBuilder();
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withCollectionBuilder(String attribute) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder();
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withListBuilder(String attribute) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder();
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withListBuilder(String attribute, int index) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder(index);
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withSetBuilder(String attribute) {
        switch (attribute) {
            case "examQuestions":
                return (EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>) (EntityViewNestedBuilder<?, ?, ?>) withExamQuestionsBuilder();
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
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(SingularAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(CollectionAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(ListAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(ListAttribute<ExamView, ElementType> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(SetAttribute<ExamView, ElementType> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?> withBuilder(MapAttribute<ExamView, KeyType, ElementType> attr, KeyType key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <KeyType, ElementType> EntityViewNestedBuilder<KeyType, ? extends EntityViewNestedBuilder<ElementType, ? extends Nested<BuilderResult>, ?>, ?> withBuilder(MapAttribute<ExamView, KeyType, ElementType> attr) {
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

