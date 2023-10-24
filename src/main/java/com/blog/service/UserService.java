package com.blog.service;

import com.blog.dto.RegistrationDto;
import com.blog.entity.User;

public interface UserService {

    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);

}

