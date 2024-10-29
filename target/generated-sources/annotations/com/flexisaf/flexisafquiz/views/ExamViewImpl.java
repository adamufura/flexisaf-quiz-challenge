package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import com.flexisaf.flexisafquiz.model.Exam;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(ExamView.class)
public class ExamViewImpl implements ExamView, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(ExamViewImpl.class, ENTITY_VIEW_MANAGER);

    private final List<ExamQuestionView> examQuestions;
    private final Long id;
    private final QuizView quiz;
    private final UUID studentId;

    public ExamViewImpl(ExamViewImpl noop, Map<String, Object> blazePersistenceOptionalParameters) {
        this.examQuestions = (List<ExamQuestionView>) (java.util.List<?>) ExamView_.examQuestions.attr().getCollectionInstantiator().createCollection(0);
        this.id = null;
        this.quiz = null;
        this.studentId = null;
    }

    public ExamViewImpl(        Long id) {
        this.$$_kind = (byte) 1;
        this.examQuestions = (List<ExamQuestionView>) (java.util.List<?>) ExamView_.examQuestions.attr().getCollectionInstantiator().createCollection(0);
        this.id = id;
        this.quiz = null;
        this.studentId = null;
    }

    public ExamViewImpl(
        Long id,
        List<ExamQuestionView> examQuestions,
        QuizView quiz,
        UUID studentId
    ) {
        super();
        this.examQuestions = examQuestions;
        this.id = id;
        this.quiz = quiz;
        this.studentId = studentId;
    }

    public ExamViewImpl(ExamViewImpl noop, int offset, Object[] tuple) {
        super();
        this.examQuestions = (List<ExamQuestionView>) tuple[offset + 1];
        this.id = (Long) tuple[offset + 0];
        this.quiz = (QuizView) tuple[offset + 2];
        this.studentId = (UUID) tuple[offset + 3];
    }

    public ExamViewImpl(ExamViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this.examQuestions = (List<ExamQuestionView>) tuple[offset + assignment[1]];
        this.id = (Long) tuple[offset + assignment[0]];
        this.quiz = (QuizView) tuple[offset + assignment[2]];
        this.studentId = (UUID) tuple[offset + assignment[3]];
    }


    @Override
    public List<ExamQuestionView> getExamQuestions() {
        return examQuestions;
    }
    @Override
    public Long getId() {
        return id;
    }
    @Override
    public QuizView getQuiz() {
        return quiz;
    }
    @Override
    public UUID getStudentId() {
        return studentId;
    }


    private byte $$_kind;

    @Override
    public Class<?> $$_getJpaManagedClass() {
        return Exam.class;
    }
    @Override
    public Class<?> $$_getJpaManagedBaseClass() {
        return Exam.class;
    }
    @Override
    public Class<?> $$_getEntityViewClass() {
        return ExamView.class;
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
        if (obj instanceof ExamView) {
            ExamView other = (ExamView) obj;
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
        return "ExamView(id = " + this.id + ")";
    }
}

