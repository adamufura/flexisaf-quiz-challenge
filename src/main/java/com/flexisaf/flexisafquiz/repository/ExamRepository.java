package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ExamRepository extends JpaRepository<Exam, UUID> {
    List<Exam> findAllByStudentId(UUID studentId);
}