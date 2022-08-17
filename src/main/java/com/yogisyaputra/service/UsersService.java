package com.yogisyaputra.service;

import com.yogisyaputra.model.manajemen_users.Users;

import java.util.List;

/**
 * project multiple-datasource-java-springboot
 * created Wednesday 17/08/2022
 * author Yogi Syaputra @yogisyaputra
 */
public interface UsersService {
    List<Users> getAll();
    Users getById(String id);
    Users save(Users users);
}
