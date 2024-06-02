package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface SubjectRepository extends JpaRepository<Subject, String> {
}
