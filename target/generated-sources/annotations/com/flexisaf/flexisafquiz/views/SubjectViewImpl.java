package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import com.flexisaf.flexisafquiz.model.Subject;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(SubjectView.class)
public class SubjectViewImpl implements SubjectView, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(SubjectViewImpl.class, ENTITY_VIEW_MANAGER);

    private final Long id;
    private final String name;
    private final List<QuestionSummaryView> questions;

    public SubjectViewImpl(SubjectViewImpl noop, Map<String, Object> blazePersistenceOptionalParameters) {
        this.id = null;
        this.name = null;
        this.questions = (List<QuestionSummaryView>) (java.util.List<?>) SubjectView_.questions.attr().getCollectionInstantiator().createCollection(0);
    }

    public SubjectViewImpl(        Long id) {
        this.$$_kind = (byte) 1;
        this.id = id;
        this.name = null;
        this.questions = (List<QuestionSummaryView>) (java.util.List<?>) SubjectView_.questions.attr().getCollectionInstantiator().createCollection(0);
    }

    public SubjectViewImpl(
        Long id,
        String name,
        List<QuestionSummaryView> questions
    ) {
        super();
        this.id = id;
        this.name = name;
        this.questions = questions;
    }

    public SubjectViewImpl(SubjectViewImpl noop, int offset, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + 0];
        this.name = (String) tuple[offset + 1];
        this.questions = (List<QuestionSummaryView>) tuple[offset + 2];
    }

    public SubjectViewImpl(SubjectViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + assignment[0]];
        this.name = (String) tuple[offset + assignment[1]];
        this.questions = (List<QuestionSummaryView>) tuple[offset + assignment[2]];
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
    public List<QuestionSummaryView> getQuestions() {
        return questions;
    }


    private byte $$_kind;

    @Override
    public Class<?> $$_getJpaManagedClass() {
        return Subject.class;
    }
    @Override
    public Class<?> $$_getJpaManagedBaseClass() {
        return Subject.class;
    }
    @Override
    public Class<?> $$_getEntityViewClass() {
        return SubjectView.class;
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
        if (obj instanceof SubjectView) {
            SubjectView other = (SubjectView) obj;
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
        return "SubjectView(id = " + this.id + ")";
    }
}

