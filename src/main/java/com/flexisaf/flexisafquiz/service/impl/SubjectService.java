package com.flexisaf.flexisafquiz.service.impl;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.Subject;
import com.flexisaf.flexisafquiz.repository.SubjectRepository;
import com.flexisaf.flexisafquiz.service.interfaces.ISubjectService;
import com.flexisaf.flexisafquiz.util.FlexiException;
import com.flexisaf.flexisafquiz.views.SubjectView;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService implements ISubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private CriteriaBuilderFactory builderFactory;

    @Autowired
    private EntityViewManager viewManager;

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public Response findAllSubjects() {
        Response response = new Response();
        try {
            CriteriaBuilder<Subject> subjectCriteriaBuilder = builderFactory.create(entityManager, Subject.class, "s");
            List<SubjectView> subjectViews = viewManager.applySetting(
                    EntityViewSetting.create(SubjectView.class),
                    subjectCriteriaBuilder
            ).getResultList();

            response.setStatusCode(200);
            response.setMessage("Subjects retrieved successfully");
            response.setSubjectViewList(subjectViews);
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error retrieving subjects: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(readOnly = true)
    public Response findSubjectById(Long subjectId) {
        Response response = new Response();
        try {
            SubjectView subjectView = viewManager.find(entityManager, SubjectView.class, subjectId);
            if (subjectView == null) {
                throw new FlexiException("Subject not found with ID: " + subjectId);
            }
            response.setStatusCode(200);
            response.setMessage("Subject found");
            response.setSubjectView(subjectView);
        } catch (FlexiException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error finding subject: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(rollbackFor = {FlexiException.class})
    public Response deleteSubject(Long subjectId) {
        Response response = new Response();
        try {
            Subject subject = subjectRepository.findById(subjectId)
                    .orElseThrow(() -> new FlexiException("Subject not found with ID: " + subjectId));
            subjectRepository.delete(subject);
            response.setStatusCode(204);
            response.setMessage("Subject deleted successfully");
        } catch (FlexiException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error deleting subject: " + e.getMessage());
        }
        return response;
    }

    @Override
    @Transactional(rollbackFor = {FlexiException.class})
    public Response saveSubject(String name) {
        Response response = new Response();
        try {

            if (name == null || name.isEmpty()) {
                throw new FlexiException("Subject name cannot be empty");
            }

            Subject subject = new Subject();
            subject.setName(name);
            Subject savedSubject = subjectRepository.save(subject);

            SubjectView subjectView = viewManager.find(entityManager, SubjectView.class, savedSubject.getId());
            response.setStatusCode(201);
            response.setMessage("Subject saved successfully:" + name);
            response.setSubjectView(subjectView);
        } catch (FlexiException e) {
                response.setStatusCode(400);
                response.setMessage(e.getMessage());
        }catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error saving subject: " + e.getMessage());
        }
        return response;
    }
}