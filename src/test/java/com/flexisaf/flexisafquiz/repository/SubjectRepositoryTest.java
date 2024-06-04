package com.flexisaf.flexisafquiz.repository;

import com.flexisaf.flexisafquiz.model.Subject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class SubjectRepositoryTest {

    @Autowired
    private SubjectRepository subjectRepository;

    @Test
    void testFindAll() {
        // Given
        Subject subject1 = new Subject("1", "Mathematics");
        Subject subject2 = new Subject("2", "Physics");
        subjectRepository.save(subject1);
        subjectRepository.save(subject2);

        // When
        List<Subject> subjects = subjectRepository.findAll();

        // Then
        assertEquals(2, subjects.size());
    }

    @Test
    void testFindById() {
        // Given
        Subject subject = new Subject("1", "Mathematics");
        subjectRepository.save(subject);

        // When
        Subject foundSubject = subjectRepository.findById("1").orElse(null);

        // Then
        assertEquals(subject.getName(), foundSubject.getName());
    }

    @Test
    void testDeleteById() {
        // Given
        Subject subject = new Subject("1", "Mathematics");
        subjectRepository.save(subject);

        // When
        subjectRepository.deleteById("1");

        // Then
        assertEquals(0, subjectRepository.count());
    }
}
