package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Question;
import java.util.Map;
import java.util.Objects;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(QuestionView.class)
public class QuestionViewImpl implements QuestionView, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(QuestionViewImpl.class, ENTITY_VIEW_MANAGER);

    private final String correctOption;
    private final DifficultyType difficulty;
    private final Long id;
    private final String optionA;
    private final String optionB;
    private final String optionC;
    private final String optionD;
    private final SubjectSummaryView subject;
    private final String text;

    public QuestionViewImpl(QuestionViewImpl noop, Map<String, Object> blazePersistenceOptionalParameters) {
        this.correctOption = null;
        this.difficulty = null;
        this.id = null;
        this.optionA = null;
        this.optionB = null;
        this.optionC = null;
        this.optionD = null;
        this.subject = null;
        this.text = null;
    }

    public QuestionViewImpl(        Long id) {
        this.$$_kind = (byte) 1;
        this.correctOption = null;
        this.difficulty = null;
        this.id = id;
        this.optionA = null;
        this.optionB = null;
        this.optionC = null;
        this.optionD = null;
        this.subject = null;
        this.text = null;
    }

    public QuestionViewImpl(
        Long id,
        String correctOption,
        DifficultyType difficulty,
        String optionA,
        String optionB,
        String optionC,
        String optionD,
        SubjectSummaryView subject,
        String text
    ) {
        super();
        this.correctOption = correctOption;
        this.difficulty = difficulty;
        this.id = id;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.subject = subject;
        this.text = text;
    }

    public QuestionViewImpl(QuestionViewImpl noop, int offset, Object[] tuple) {
        super();
        this.correctOption = (String) tuple[offset + 1];
        this.difficulty = (DifficultyType) tuple[offset + 2];
        this.id = (Long) tuple[offset + 0];
        this.optionA = (String) tuple[offset + 3];
        this.optionB = (String) tuple[offset + 4];
        this.optionC = (String) tuple[offset + 5];
        this.optionD = (String) tuple[offset + 6];
        this.subject = (SubjectSummaryView) tuple[offset + 7];
        this.text = (String) tuple[offset + 8];
    }

    public QuestionViewImpl(QuestionViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this.correctOption = (String) tuple[offset + assignment[1]];
        this.difficulty = (DifficultyType) tuple[offset + assignment[2]];
        this.id = (Long) tuple[offset + assignment[0]];
        this.optionA = (String) tuple[offset + assignment[3]];
        this.optionB = (String) tuple[offset + assignment[4]];
        this.optionC = (String) tuple[offset + assignment[5]];
        this.optionD = (String) tuple[offset + assignment[6]];
        this.subject = (SubjectSummaryView) tuple[offset + assignment[7]];
        this.text = (String) tuple[offset + assignment[8]];
    }


    @Override
    public String getCorrectOption() {
        return correctOption;
    }
    @Override
    public DifficultyType getDifficulty() {
        return difficulty;
    }
    @Override
    public Long getId() {
        return id;
    }
    @Override
    public String getOptionA() {
        return optionA;
    }
    @Override
    public String getOptionB() {
        return optionB;
    }
    @Override
    public String getOptionC() {
        return optionC;
    }
    @Override
    public String getOptionD() {
        return optionD;
    }
    @Override
    public SubjectSummaryView getSubject() {
        return subject;
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
        return QuestionView.class;
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
        if (obj instanceof QuestionView) {
            QuestionView other = (QuestionView) obj;
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
        return "QuestionView(id = " + this.id + ")";
    }
}

