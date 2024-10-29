package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import com.flexisaf.flexisafquiz.model.ExamQuestion;
import java.util.Map;
import java.util.Objects;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(ExamQuestionView.class)
public class ExamQuestionViewImpl implements ExamQuestionView, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(ExamQuestionViewImpl.class, ENTITY_VIEW_MANAGER);

    private final boolean correct;
    private final Long id;
    private final QuestionView question;
    private final String selectedOption;

    public ExamQuestionViewImpl(ExamQuestionViewImpl noop, Map<String, Object> blazePersistenceOptionalParameters) {
        this.correct = false;
        this.id = null;
        this.question = null;
        this.selectedOption = null;
    }

    public ExamQuestionViewImpl(        Long id) {
        this.$$_kind = (byte) 1;
        this.correct = false;
        this.id = id;
        this.question = null;
        this.selectedOption = null;
    }

    public ExamQuestionViewImpl(
        Long id,
        boolean correct,
        QuestionView question,
        String selectedOption
    ) {
        super();
        this.correct = correct;
        this.id = id;
        this.question = question;
        this.selectedOption = selectedOption;
    }

    public ExamQuestionViewImpl(ExamQuestionViewImpl noop, int offset, Object[] tuple) {
        super();
        this.correct = (boolean) tuple[offset + 1];
        this.id = (Long) tuple[offset + 0];
        this.question = (QuestionView) tuple[offset + 2];
        this.selectedOption = (String) tuple[offset + 3];
    }

    public ExamQuestionViewImpl(ExamQuestionViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this.correct = (boolean) tuple[offset + assignment[1]];
        this.id = (Long) tuple[offset + assignment[0]];
        this.question = (QuestionView) tuple[offset + assignment[2]];
        this.selectedOption = (String) tuple[offset + assignment[3]];
    }


    @Override
    public boolean getCorrect() {
        return correct;
    }
    @Override
    public Long getId() {
        return id;
    }
    @Override
    public QuestionView getQuestion() {
        return question;
    }
    @Override
    public String getSelectedOption() {
        return selectedOption;
    }


    private byte $$_kind;

    @Override
    public Class<?> $$_getJpaManagedClass() {
        return ExamQuestion.class;
    }
    @Override
    public Class<?> $$_getJpaManagedBaseClass() {
        return ExamQuestion.class;
    }
    @Override
    public Class<?> $$_getEntityViewClass() {
        return ExamQuestionView.class;
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
        if (obj instanceof ExamQuestionView) {
            ExamQuestionView other = (ExamQuestionView) obj;
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
        return "ExamQuestionView(id = " + this.id + ")";
    }
}

