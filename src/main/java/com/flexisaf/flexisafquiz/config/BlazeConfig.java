package com.flexisaf.flexisafquiz.config;

import com.blazebit.persistence.Criteria;
import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.spi.CriteriaBuilderConfiguration;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViews;
import com.blazebit.persistence.view.spi.EntityViewConfiguration;
import com.flexisaf.flexisafquiz.views.*;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BlazeConfig {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Lazy(false)
    public CriteriaBuilderFactory createCriteriaBuilderFactory() {
        CriteriaBuilderConfiguration config = Criteria.getDefault();
        return config.createCriteriaBuilderFactory(entityManagerFactory);
    }

    @Bean
    public EntityViewConfiguration entityViewConfiguration() {
        // Automatically scan for entity views in the specified package
        EntityViewConfiguration entityViewConfiguration = EntityViews.createDefaultConfiguration();

        // Register entity views:
        entityViewConfiguration.addEntityView(UserView.class);

        entityViewConfiguration.addEntityView(SubjectView.class);
        entityViewConfiguration.addEntityView(SubjectSummaryView.class);

        entityViewConfiguration.addEntityView(QuestionView.class);
        entityViewConfiguration.addEntityView(QuestionSummaryView.class);

        entityViewConfiguration.addEntityView(QuizView.class);
        entityViewConfiguration.addEntityView(QuizQuestionView.class);
        entityViewConfiguration.addEntityView(QuizSubjectView.class);

        entityViewConfiguration.addEntityView(ExamView.class);
        entityViewConfiguration.addEntityView(ExamQuestionView.class);

        return entityViewConfiguration;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Lazy(false)
    public EntityViewManager createEntityViewManager(CriteriaBuilderFactory cbf, EntityViewConfiguration entityViewConfiguration) {
        return entityViewConfiguration.createEntityViewManager(cbf);
    }
}
