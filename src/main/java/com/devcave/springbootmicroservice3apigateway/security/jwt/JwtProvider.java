package com.devcave.springbootmicroservice3apigateway.security.jwt;

import com.devcave.springbootmicroservice3apigateway.model.User;
import com.devcave.springbootmicroservice3apigateway.security.UserPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public interface JwtProvider {
    String generateToken(UserPrincipal auth);

    String generateToken(User user);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
