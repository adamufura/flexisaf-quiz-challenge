package com.flexisaf.flexisafquiz.service.interfaces;

import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.views.ExamView;

import java.util.UUID;

public interface IExamService {
    Response startExam(UUID studentId, Long quizId);
    Response answerQuestion(Long examId, Long questionId, String selectedOption);
    Response getExamScore(Long examId);
}
