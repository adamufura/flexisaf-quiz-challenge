package com.flexisaf.flexisafquiz.service.interfaces;

import com.flexisaf.flexisafquiz.dto.Response;

public interface ISubjectService {

    Response findAllSubjects();

    Response findSubjectById(Long subjectId);

    Response deleteSubject(Long subjectId);

    Response saveSubject(String name);
}
