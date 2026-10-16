package com.springboot.service.impl;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;
import com.springboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserSerivceImpl implements UserService {

    private final UserRepository userRepository;

    public UserSerivceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.findByEmail(email) != null;
    }
}
