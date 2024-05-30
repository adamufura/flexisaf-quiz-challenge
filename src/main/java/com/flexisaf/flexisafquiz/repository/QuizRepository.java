package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface QuizRepository extends JpaRepository<Quiz, UUID> {
}
