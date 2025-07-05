package com.eventhub.users.service;

import java.util.List;

import com.eventhub.users.model.Users;
import com.eventhub.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users createUser(Users users) {
        return userRepository.createUser(users);
    }

    public Users getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
