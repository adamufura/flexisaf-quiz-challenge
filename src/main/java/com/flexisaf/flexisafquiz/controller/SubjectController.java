package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Subject;
import com.flexisaf.flexisafquiz.service.impl.SubjectService;
import com.flexisaf.flexisafquiz.service.interfaces.ISubjectService;
import com.flexisaf.flexisafquiz.views.SubjectView;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Subjects Controller", description = "Operations related to subjects")
@RestController
@RequestMapping("/api/subjects")
@Validated
public class SubjectController {

    @Autowired
    private ISubjectService subjectService;

    @Operation(summary = "Create a new subject",
            description = "This endpoint creates a new subject in the system.")
    @PostMapping
    public ResponseEntity<Response> createSubject(@Valid @RequestBody Subject subject) {
        Response response = subjectService.saveSubject(subject.getName());
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }


    @Operation(summary = "Get all subjects",
            description = "This endpoint retrieves all subjects.")
    @GetMapping
    public ResponseEntity<Response> getAllSubjects() {
        Response response = subjectService.findAllSubjects();
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }


    @Operation(summary = "Get a subject by ID",
            description = "This endpoint retrieves a subject by its ID, including its associated questions.")
    @GetMapping("/{subjectId}")
    public ResponseEntity<Response> getSubject(@PathVariable Long subjectId) {
        Response response = subjectService.findSubjectById(subjectId);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }


    @Operation(summary = "Delete a subject",
            description = "This endpoint deletes a subject by its ID.")
    @DeleteMapping("/{subjectId}")
    public ResponseEntity<Response> deleteSubject(@PathVariable Long subjectId) {
        Response response = subjectService.deleteSubject(subjectId);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
}
