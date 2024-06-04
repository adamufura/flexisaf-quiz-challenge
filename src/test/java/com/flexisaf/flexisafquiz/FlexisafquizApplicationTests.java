package com.flexisaf.flexisafquiz;

import com.flexisaf.flexisafquiz.service.SubjectServiceTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlexisafquizApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void runSubjectServiceTests() {
		SubjectServiceTest subjectServiceTest = new SubjectServiceTest();
		subjectServiceTest.testGetAllSubjects();
	}

}
