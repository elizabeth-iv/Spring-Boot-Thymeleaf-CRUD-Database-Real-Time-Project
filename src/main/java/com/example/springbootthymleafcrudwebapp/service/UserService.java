package com.example.springbootthymleafcrudwebapp.service;

import com.example.springbootthymleafcrudwebapp.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import springbootthymleafcrudwebapp.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
