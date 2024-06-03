package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.Question;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findBySubjectIdAndDifficulty(String subjectId, DifficultyType difficulty);
}
