package com.ecquaria.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ecquaria.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{
UserDto createUser(UserDto user);
}
