package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodListAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(ExamView.class)
public abstract class ExamView_ {
    public static volatile ExamQuestionViewRelation<ExamView, MethodListAttribute<ExamView, ExamQuestionView>> examQuestions;
    public static volatile MethodSingularAttribute<ExamView, Long> id;
    public static volatile QuizViewRelation<ExamView, MethodSingularAttribute<ExamView, QuizView>> quiz;
    public static volatile MethodSingularAttribute<ExamView, UUID> studentId;

    public static final String EXAM_QUESTIONS = "examQuestions";
    public static final String ID = "id";
    public static final String QUIZ = "quiz";
    public static final String STUDENT_ID = "studentId";
    public static final String EXAM_QUESTIONSCORRECT = "examQuestions.correct";
    public static final String EXAM_QUESTIONSID = "examQuestions.id";
    public static final String EXAM_QUESTIONSQUESTION = "examQuestions.question";
    public static final String EXAM_QUESTIONSSELECTED_OPTION = "examQuestions.selectedOption";

    public static final String EXAM_QUESTIONS__QUESTIONCORRECT_OPTION = "examQuestions.question.correctOption";
    public static final String EXAM_QUESTIONS__QUESTIONDIFFICULTY = "examQuestions.question.difficulty";
    public static final String EXAM_QUESTIONS__QUESTIONID = "examQuestions.question.id";
    public static final String EXAM_QUESTIONS__QUESTIONOPTION_A = "examQuestions.question.optionA";
    public static final String EXAM_QUESTIONS__QUESTIONOPTION_B = "examQuestions.question.optionB";
    public static final String EXAM_QUESTIONS__QUESTIONOPTION_C = "examQuestions.question.optionC";
    public static final String EXAM_QUESTIONS__QUESTIONOPTION_D = "examQuestions.question.optionD";
    public static final String EXAM_QUESTIONS__QUESTIONSUBJECT = "examQuestions.question.subject";
    public static final String EXAM_QUESTIONS__QUESTIONTEXT = "examQuestions.question.text";

    public static final String EXAM_QUESTIONS__QUESTION__SUBJECTID = "examQuestions.question.subject.id";
    public static final String EXAM_QUESTIONS__QUESTION__SUBJECTNAME = "examQuestions.question.subject.name";
    public static final String QUIZID = "quiz.id";
    public static final String QUIZNAME = "quiz.name";
    public static final String QUIZSUBJECTS = "quiz.subjects";
    public static final String QUIZTYPE = "quiz.type";

    public static final String QUIZ__SUBJECTSID = "quiz.subjects.id";
    public static final String QUIZ__SUBJECTSNAME = "quiz.subjects.name";
    public static final String QUIZ__SUBJECTSQUESTIONS = "quiz.subjects.questions";

    public static final String QUIZ__SUBJECTS__QUESTIONSCORRECT_OPTION = "quiz.subjects.questions.correctOption";
    public static final String QUIZ__SUBJECTS__QUESTIONSDIFFICULTY = "quiz.subjects.questions.difficulty";
    public static final String QUIZ__SUBJECTS__QUESTIONSID = "quiz.subjects.questions.id";
    public static final String QUIZ__SUBJECTS__QUESTIONSOPTION_A = "quiz.subjects.questions.optionA";
    public static final String QUIZ__SUBJECTS__QUESTIONSOPTION_B = "quiz.subjects.questions.optionB";
    public static final String QUIZ__SUBJECTS__QUESTIONSOPTION_C = "quiz.subjects.questions.optionC";
    public static final String QUIZ__SUBJECTS__QUESTIONSOPTION_D = "quiz.subjects.questions.optionD";
    public static final String QUIZ__SUBJECTS__QUESTIONSTEXT = "quiz.subjects.questions.text";

    public static EntityViewSetting<ExamView, CriteriaBuilder<ExamView>> createSettingInit() {
        return EntityViewSetting.create(ExamView.class, "init");
    }
    public static EntityViewSetting<ExamView, PaginatedCriteriaBuilder<ExamView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(ExamView.class, firstResult, maxResults, "init");
    }

}

