package com.krkimb.authproject2.security;

import java.util.Optional;

import com.krkimb.authproject2.entity.User;


public interface UserService {
    public Optional<User> getByUsername(String username);
}
