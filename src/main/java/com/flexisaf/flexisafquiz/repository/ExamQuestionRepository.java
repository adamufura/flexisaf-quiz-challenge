package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.ExamQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamQuestionRepository extends JpaRepository<ExamQuestion, Long> {
}