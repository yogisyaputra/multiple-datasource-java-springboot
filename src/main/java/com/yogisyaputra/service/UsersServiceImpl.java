package com.yogisyaputra.service;

import com.yogisyaputra.model.manajemen_users.Users;
import com.yogisyaputra.repository.manajemen_users.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * project multiple-datasource-java-springboot
 * created Wednesday 17/08/2022
 * author Yogi Syaputra @yogisyaputra
 */
@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users getById(String id) {
        return usersRepository.findById(id).orElse(null);
    }

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }
}
