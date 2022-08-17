package com.yogisyaputra;

import com.yogisyaputra.model.manajemen_company.Company;
import com.yogisyaputra.model.manajemen_users.Users;
import com.yogisyaputra.service.CompanyService;
import com.yogisyaputra.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class MultipleDatasourceJavaSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultipleDatasourceJavaSpringbootApplication.class, args);
    }
}
