package com.flexisaf.flexisafquiz.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class StartExamRequest {
    private UUID studentId;
    private Long quizId;
}
