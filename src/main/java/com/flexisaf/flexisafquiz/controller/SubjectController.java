package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.SubjectDTO;
import com.flexisaf.flexisafquiz.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.UUID;

@Tag(name = "Subjects Controller", description = "Operations related to subjects")
@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping
    public ResponseEntity<SubjectDTO> createSubject(@RequestBody String name) {
        SubjectDTO createdSubject = subjectService.createSubject(name);
        return ResponseEntity.ok(createdSubject);
    }

    @GetMapping
    public ResponseEntity<List<SubjectDTO>> getAllSubjects() {
        List<SubjectDTO> allSubjects = subjectService.getAllSubjects();
        return ResponseEntity.ok(allSubjects);
    }

    @GetMapping("/{subjectId}")
    public ResponseEntity<SubjectDTO> getSubject(@PathVariable UUID subjectId) {
        return subjectService.getSubject(subjectId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
