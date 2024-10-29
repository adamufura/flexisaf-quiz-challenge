package com.flexisaf.flexisafquiz.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.flexisaf.flexisafquiz.model.Exam;
import java.util.List;
import java.util.UUID;

@EntityView(Exam.class)
public interface ExamView {

    @IdMapping
    Long getId();

    UUID getStudentId();

    QuizView getQuiz();

    List<ExamQuestionView> getExamQuestions();
}
