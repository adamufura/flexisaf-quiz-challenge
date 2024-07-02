package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, String> {
}
