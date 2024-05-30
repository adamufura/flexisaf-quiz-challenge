package com.flexisaf.flexisafquiz.service;

import com.flexisaf.flexisafquiz.dto.SubjectDTO;
import com.flexisaf.flexisafquiz.model.Subject;
import com.flexisaf.flexisafquiz.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public SubjectDTO createSubject(String name) {
        Subject subject = new Subject();
        subject.setName(name);
        Subject savedSubject = subjectRepository.save(subject);
        return mapToDto(savedSubject);
    }

    public List<SubjectDTO> getAllSubjects() {
        List<Subject> subjects = subjectRepository.findAll();
        return subjects.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public Optional<SubjectDTO> getSubject(UUID subjectId) {
        return subjectRepository.findById(subjectId)
                .map(this::mapToDto);
    }

    private SubjectDTO mapToDto(Subject subject) {
        SubjectDTO dto = new SubjectDTO();
        dto.setId(subject.getId());
        dto.setName(subject.getName());
        return dto;
    }
}