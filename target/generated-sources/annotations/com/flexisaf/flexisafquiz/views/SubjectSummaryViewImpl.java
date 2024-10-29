package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import com.flexisaf.flexisafquiz.model.Subject;
import java.util.Map;
import java.util.Objects;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(SubjectSummaryView.class)
public class SubjectSummaryViewImpl implements SubjectSummaryView, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(SubjectSummaryViewImpl.class, ENTITY_VIEW_MANAGER);

    private final Long id;
    private final String name;

    public SubjectSummaryViewImpl(SubjectSummaryViewImpl noop, Map<String, Object> blazePersistenceOptionalParameters) {
        this.id = null;
        this.name = null;
    }

    public SubjectSummaryViewImpl(        Long id) {
        this.$$_kind = (byte) 1;
        this.id = id;
        this.name = null;
    }

    public SubjectSummaryViewImpl(
        Long id,
        String name
    ) {
        super();
        this.id = id;
        this.name = name;
    }

    public SubjectSummaryViewImpl(SubjectSummaryViewImpl noop, int offset, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + 0];
        this.name = (String) tuple[offset + 1];
    }

    public SubjectSummaryViewImpl(SubjectSummaryViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + assignment[0]];
        this.name = (String) tuple[offset + assignment[1]];
    }


    @Override
    public Long getId() {
        return id;
    }
    @Override
    public String getName() {
        return name;
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
        return SubjectSummaryView.class;
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
        if (obj instanceof SubjectSummaryView) {
            SubjectSummaryView other = (SubjectSummaryView) obj;
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
        return "SubjectSummaryView(id = " + this.id + ")";
    }
}

