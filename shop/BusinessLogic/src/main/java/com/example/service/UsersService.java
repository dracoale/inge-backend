package com.example.service;

import com.example.model.Users;
import com.example.repository.UsersRepository;

public class UsersService {
    private UsersRepository usersRepository;

    public Users saveUsers(Users users){
        usersRepository.save(users);
    }
}
