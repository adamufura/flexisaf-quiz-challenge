package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findBySubjectIdAndDifficulty(String subjectId, DifficultyType difficulty);
}
