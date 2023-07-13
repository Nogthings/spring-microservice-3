package com.devcave.springbootmicroservice3apigateway.service;

import com.devcave.springbootmicroservice3apigateway.model.Role;
import com.devcave.springbootmicroservice3apigateway.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
