package com.flexisaf.flexisafquiz.dto;

import com.flexisaf.flexisafquiz.model.*;
import com.flexisaf.flexisafquiz.views.*;
import jakarta.validation.constraints.Null;
import lombok.Data;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private int statusCode;
    private String message;

    private String token;
    private Role role;
    private UserView userView;

    private SubjectView subjectView;
    private List<SubjectView> subjectViewList;

    private QuestionView questionView;
    private List<QuestionView> questionViewList;

    private QuizView quizView;
    private List<QuizView> quizViews;

    private ExamView examView;

    private int score;
}
