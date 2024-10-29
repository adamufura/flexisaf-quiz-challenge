package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import com.flexisaf.flexisafquiz.model.Question;
import java.util.Map;
import java.util.Objects;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(QuestionSummaryView.class)
public class QuestionSummaryViewImpl implements QuestionSummaryView, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(QuestionSummaryViewImpl.class, ENTITY_VIEW_MANAGER);

    private final Long id;
    private final String text;

    public QuestionSummaryViewImpl(QuestionSummaryViewImpl noop, Map<String, Object> blazePersistenceOptionalParameters) {
        this.id = null;
        this.text = null;
    }

    public QuestionSummaryViewImpl(        Long id) {
        this.$$_kind = (byte) 1;
        this.id = id;
        this.text = null;
    }

    public QuestionSummaryViewImpl(
        Long id,
        String text
    ) {
        super();
        this.id = id;
        this.text = text;
    }

    public QuestionSummaryViewImpl(QuestionSummaryViewImpl noop, int offset, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + 0];
        this.text = (String) tuple[offset + 1];
    }

    public QuestionSummaryViewImpl(QuestionSummaryViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + assignment[0]];
        this.text = (String) tuple[offset + assignment[1]];
    }


    @Override
    public Long getId() {
        return id;
    }
    @Override
    public String getText() {
        return text;
    }


    private byte $$_kind;

    @Override
    public Class<?> $$_getJpaManagedClass() {
        return Question.class;
    }
    @Override
    public Class<?> $$_getJpaManagedBaseClass() {
        return Question.class;
    }
    @Override
    public Class<?> $$_getEntityViewClass() {
        return QuestionSummaryView.class;
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
        if (obj instanceof QuestionSummaryView) {
            QuestionSummaryView other = (QuestionSummaryView) obj;
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
        return "QuestionSummaryView(id = " + this.id + ")";
    }
}

