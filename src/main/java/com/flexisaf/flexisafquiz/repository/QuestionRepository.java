package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.DifficultyType;
import com.flexisaf.flexisafquiz.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface QuestionRepository extends JpaRepository<Question, UUID> {
    List<Question> findBySubjectIdAndDifficulty(UUID subjectId, DifficultyType difficulty);
}