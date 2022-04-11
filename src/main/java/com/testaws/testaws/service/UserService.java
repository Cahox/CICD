package com.testaws.testaws.service;

import com.testaws.testaws.entity.User;
import com.testaws.testaws.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        log.info("inside save user method of UserService");
        return userRepository.save(user);
    }

    public User findUserById(Long userId) {
        log.info("inside find user by id method of UserService");
        return userRepository.findByUserId(userId);
    }
}
