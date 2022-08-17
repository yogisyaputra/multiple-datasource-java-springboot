package com.yogisyaputra.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * project multiple-datasource-java-springboot
 * created Wednesday 17/08/2022
 * author Yogi Syaputra @yogisyaputra
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "manajemenCompanyEntityManagerFactory",
        transactionManagerRef = "manajemenCompanyTransactionManager",
        basePackages = { "com.yogisyaputra.repository.manajemen_company" })
public class ManajemenCompanyDBConfig {

    @Bean(name="manajemenCompanyProps")
    @ConfigurationProperties("spring.manajemen-company.datasource")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }


    @Bean(name="manajemenCompanyDatasource")
    @ConfigurationProperties(prefix = "spring.manajemen-company.datasource")
    public DataSource datasource(@Qualifier("manajemenCompanyProps") DataSourceProperties properties){
        return properties.initializeDataSourceBuilder().build();
    }


    @Bean(name="manajemenCompanyEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
            (EntityManagerFactoryBuilder builder,
             @Qualifier("manajemenCompanyDatasource") DataSource dataSource){
        return builder.dataSource(dataSource)
                .packages("com.yogisyaputra.model.manajemen_company")
                .persistenceUnit("ManajemenCompany").build();
    }


    @Bean(name = "manajemenCompanyTransactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("manajemenCompanyEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
