package com.flexisaf.flexisafquiz.service;

import com.flexisaf.flexisafquiz.dto.SubjectDTO;
import com.flexisaf.flexisafquiz.model.Subject;
import com.flexisaf.flexisafquiz.repository.SubjectRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SubjectServiceTest {

    @Mock
    private SubjectRepository subjectRepository;

    @InjectMocks
    private SubjectService subjectService;

    public SubjectServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllSubjects() {
        // Mock data
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(new Subject("SUB1", "Mathematics"));
        subjectList.add(new Subject("SUB2", "Physics"));
        when(subjectRepository.findAll()).thenReturn(subjectList);

        // Call service method
        List<SubjectDTO> result = subjectService.getAllSubjects();

        // Verify the result
        assertEquals(2, result.size());
        assertEquals("Mathematics", result.get(0).getName());
        assertEquals("Physics", result.get(1).getName());
    }
}
