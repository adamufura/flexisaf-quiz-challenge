package com.flexisaf.flexisafquiz.service;

import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Subject;
import com.flexisaf.flexisafquiz.repository.SubjectRepository;
import com.flexisaf.flexisafquiz.service.impl.SubjectService;
import com.flexisaf.flexisafquiz.util.FlexiException;
import com.flexisaf.flexisafquiz.views.SubjectView;
import com.blazebit.persistence.view.EntityViewManager;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class SubjectServiceTest {

    @Mock
    private SubjectRepository subjectRepository;

    @Mock
    private EntityViewManager viewManager;

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private SubjectService subjectService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveSubject_Success() {
        String subjectName = "Math";
        Subject savedSubject = new Subject();
        savedSubject.setId(1L);
        savedSubject.setName(subjectName);
        when(subjectRepository.save(any(Subject.class))).thenReturn(savedSubject);
        when(viewManager.find(entityManager, SubjectView.class, savedSubject.getId())).thenReturn(mock(SubjectView.class));

        // When
        Response response = subjectService.saveSubject(subjectName);

        // Then
        assertEquals(201, response.getStatusCode());
        assertEquals("Subject saved successfully", response.getMessage());
        assertNotNull(response.getSubjectView());
    }

    @Test
    void testSaveSubject_EmptyName() {
        // When
        Response response = subjectService.saveSubject("");

        // Then
        assertEquals(400, response.getStatusCode());
        assertTrue(response.getMessage().contains("Subject name cannot be empty"));
    }

    @Test
    void testDeleteSubject_Success() {
        // Given
        Long subjectId = 1L;
        Subject subject = new Subject();
        subject.setId(subjectId);
        when(subjectRepository.findById(subjectId)).thenReturn(Optional.of(subject));

        // When
        Response response = subjectService.deleteSubject(subjectId);

        // Then
        assertEquals(204, response.getStatusCode());
        assertEquals("Subject deleted successfully", response.getMessage());
        verify(subjectRepository, times(1)).delete(subject);
    }

    @Test
    void testDeleteSubject_NotFound() {
        // Given
        Long subjectId = 1L;
        when(subjectRepository.findById(subjectId)).thenReturn(Optional.empty());

        // When
        Response response = subjectService.deleteSubject(subjectId);

        // Then
        assertEquals(404, response.getStatusCode());
        assertTrue(response.getMessage().contains("Subject not found with ID:"));
    }

    @Test
    void testFindSubjectById_Success() {
        // Given
        Long subjectId = 1L;
        SubjectView mockSubjectView = mock(SubjectView.class);
        when(viewManager.find(entityManager, SubjectView.class, subjectId)).thenReturn(mockSubjectView);

        // When
        Response response = subjectService.findSubjectById(subjectId);

        // Then
        assertEquals(200, response.getStatusCode());
        assertEquals("Subject found", response.getMessage());
        assertEquals(mockSubjectView, response.getSubjectView());
    }

    @Test
    void testFindSubjectById_NotFound() {
        // Given
        Long subjectId = 1L;
        when(viewManager.find(entityManager, SubjectView.class, subjectId)).thenReturn(null);

        // When
        Response response = subjectService.findSubjectById(subjectId);

        // Then
        assertEquals(404, response.getStatusCode());
        assertTrue(response.getMessage().contains("Subject not found with ID:"));
    }
}
