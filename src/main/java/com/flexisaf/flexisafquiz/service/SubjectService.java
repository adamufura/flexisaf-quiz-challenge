package com.flexisaf.flexisafquiz.service;

import com.flexisaf.flexisafquiz.dto.QuestionDTO;
import com.flexisaf.flexisafquiz.dto.SubjectDTO;
import com.flexisaf.flexisafquiz.model.Question;
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

    public Optional<SubjectDTO> getSubject(String subjectId) {
        return subjectRepository.findById(subjectId)
                .map(this::mapToDtoWithQuestions);
    }

    public void deleteSubject(String subjectId) {
        subjectRepository.deleteById(subjectId);
    }

    private SubjectDTO mapToDto(Subject subject) {
        SubjectDTO dto = new SubjectDTO();
        dto.setId(subject.getId());
        dto.setName(subject.getName());
        return dto;
    }

    private SubjectDTO mapToDtoWithQuestions(Subject subject) {
        SubjectDTO dto = new SubjectDTO();
        dto.setId(subject.getId());
        dto.setName(subject.getName());
        List<QuestionDTO> questions = subject.getQuestions().stream()
                .map(this::mapToQuestionDto)
                .collect(Collectors.toList());
        dto.setQuestions(questions);
        return dto;
    }

    private QuestionDTO mapToQuestionDto(Question question) {
        QuestionDTO dto = new QuestionDTO();
        dto.setId(question.getId());
        dto.setText(question.getText());
        dto.setDifficulty(question.getDifficulty());
        return dto;
    }
}
