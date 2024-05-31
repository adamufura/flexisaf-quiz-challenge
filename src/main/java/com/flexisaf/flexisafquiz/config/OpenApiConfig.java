package com.flexisaf.flexisafquiz.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Flexisaf Quiz API")
                        .version("1.0.0")
                        .description("API documentation for the Flexisaf Quiz application. It is a system that create and manage quizzes " +
                                "it has ADMINS, STUDENTS, SUBJECTS AND QUESTIONS, Students can take quizzes")
                        .contact(new Contact().name("Adamu Fura Suleiman")
                                .email("adamufura98@gmail.com").url("localhost"))
                )
                .addTagsItem(new Tag().name("Auth Controller").description("Authentication and Authorization"))
                .addTagsItem(new Tag().name("Subjects Controller").description("Operations related to subjects"))
                .addTagsItem(new Tag().name("Questions Controller").description("Operations related to questions"))
                .addTagsItem(new Tag().name("Quizzes Controller").description("Operations related to quizzes"))
                .addTagsItem(new Tag().name("Exams Controller").description("Operations related to exams"))
                .components(new Components()
                        .addSecuritySchemes("bearer-jwt", new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")))
                .addSecurityItem(new SecurityRequirement().addList("bearer-jwt"));
    }
}
