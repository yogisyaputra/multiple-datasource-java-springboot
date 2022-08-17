package com.yogisyaputra.service;

import com.yogisyaputra.model.manajemen_company.Company;
import com.yogisyaputra.repository.manajemen_company.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * project multiple-datasource-java-springboot
 * created Wednesday 17/08/2022
 * author Yogi Syaputra @yogisyaputra
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company getById(String id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }
}
