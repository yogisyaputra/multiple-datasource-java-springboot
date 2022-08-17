package com.yogisyaputra.repository.manajemen_company;

import com.yogisyaputra.model.manajemen_company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * project multiple-datasource-java-springboot
 * created Wednesday 17/08/2022
 * author Yogi Syaputra @yogisyaputra
 */

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
}
