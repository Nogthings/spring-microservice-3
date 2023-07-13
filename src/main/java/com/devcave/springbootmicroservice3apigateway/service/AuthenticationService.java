package com.devcave.springbootmicroservice3apigateway.service;

import com.devcave.springbootmicroservice3apigateway.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
