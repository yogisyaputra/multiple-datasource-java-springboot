package com.yogisyaputra.service;

import com.yogisyaputra.model.manajemen_company.Company;

import java.util.List;

/**
 * project multiple-datasource-java-springboot
 * created Wednesday 17/08/2022
 * author Yogi Syaputra @yogisyaputra
 */
public interface CompanyService {
    List<Company> getAll();
    Company getById(String id);
    Company save(Company company);
}
