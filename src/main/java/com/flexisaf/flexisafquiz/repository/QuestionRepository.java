package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.Question;
import com.flexisaf.flexisafquiz.model.DifficultyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.flexisaf.flexisafquiz.model.Subject;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findBySubjectIdAndDifficulty(String subjectId, DifficultyType difficulty);

    @Query("SELECT q FROM Question q WHERE q.difficulty = :difficulty AND q.subject IN :subjects")
    List<Question> findByDifficultyAndSubjectsIn(@Param("difficulty") DifficultyType difficulty, @Param("subjects") List<Subject> subjects);
}
