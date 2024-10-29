package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Quiz;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(QuizView.class)
public class QuizViewImpl implements QuizView, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(QuizViewImpl.class, ENTITY_VIEW_MANAGER);

    private final Long id;
    private final String name;
    private final List<QuizSubjectView> subjects;
    private final DifficultyType type;

    public QuizViewImpl(QuizViewImpl noop, Map<String, Object> blazePersistenceOptionalParameters) {
        this.id = null;
        this.name = null;
        this.subjects = (List<QuizSubjectView>) (java.util.List<?>) QuizView_.subjects.attr().getCollectionInstantiator().createCollection(0);
        this.type = null;
    }

    public QuizViewImpl(        Long id) {
        this.$$_kind = (byte) 1;
        this.id = id;
        this.name = null;
        this.subjects = (List<QuizSubjectView>) (java.util.List<?>) QuizView_.subjects.attr().getCollectionInstantiator().createCollection(0);
        this.type = null;
    }

    public QuizViewImpl(
        Long id,
        String name,
        List<QuizSubjectView> subjects,
        DifficultyType type
    ) {
        super();
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.type = type;
    }

    public QuizViewImpl(QuizViewImpl noop, int offset, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + 0];
        this.name = (String) tuple[offset + 1];
        this.subjects = (List<QuizSubjectView>) tuple[offset + 2];
        this.type = (DifficultyType) tuple[offset + 3];
    }

    public QuizViewImpl(QuizViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + assignment[0]];
        this.name = (String) tuple[offset + assignment[1]];
        this.subjects = (List<QuizSubjectView>) tuple[offset + assignment[2]];
        this.type = (DifficultyType) tuple[offset + assignment[3]];
    }


    @Override
    public Long getId() {
        return id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public List<QuizSubjectView> getSubjects() {
        return subjects;
    }
    @Override
    public DifficultyType getType() {
        return type;
    }


    private byte $$_kind;

    @Override
    public Class<?> $$_getJpaManagedClass() {
        return Quiz.class;
    }
    @Override
    public Class<?> $$_getJpaManagedBaseClass() {
        return Quiz.class;
    }
    @Override
    public Class<?> $$_getEntityViewClass() {
        return QuizView.class;
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
        if (obj instanceof QuizView) {
            QuizView other = (QuizView) obj;
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
        return "QuizView(id = " + this.id + ")";
    }
}

