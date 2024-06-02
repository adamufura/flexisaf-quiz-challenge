package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.SubjectDTO;
import com.flexisaf.flexisafquiz.service.SubjectService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Subjects Controller", description = "Operations related to subjects")
@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @Operation(summary = "Create a new subject",
            description = "This endpoint creates a new subject in the system.")
    @PostMapping
    public ResponseEntity<SubjectDTO> createSubject(@RequestBody String name) {
        SubjectDTO createdSubject = subjectService.createSubject(name);
        return ResponseEntity.ok(createdSubject);
    }

    @Operation(summary = "Get all subjects",
            description = "This endpoint retrieves all subjects.")
    @GetMapping
    public ResponseEntity<List<SubjectDTO>> getAllSubjects() {
        List<SubjectDTO> allSubjects = subjectService.getAllSubjects();
        return ResponseEntity.ok(allSubjects);
    }

    @Operation(summary = "Get a subject by ID",
            description = "This endpoint retrieves a subject by its ID, including its associated questions.")
    @GetMapping("/{subjectId}")
    public ResponseEntity<SubjectDTO> getSubject(@PathVariable String subjectId) {
        return subjectService.getSubject(subjectId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Delete a subject",
            description = "This endpoint deletes a subject by its ID.")
    @DeleteMapping("/{subjectId}")
    public ResponseEntity<Void> deleteSubject(@PathVariable String subjectId) {
        subjectService.deleteSubject(subjectId);
        return ResponseEntity.noContent().build();
    }
}