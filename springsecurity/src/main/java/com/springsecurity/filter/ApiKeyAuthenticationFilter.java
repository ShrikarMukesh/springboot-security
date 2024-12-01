package com.springsecurity.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class ApiKeyAuthenticationFilter extends OncePerRequestFilter {

    private final String apiKey = "abcdefg"; // Replace with your actual API key

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String providedApiKey = request.getHeader("api_key");

        if (apiKey.equals(providedApiKey)) {
            // API key is valid, continue processing the request
            filterChain.doFilter(request, response);
        } else {
            // API key is not valid, send a 401 Unauthorized response
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }
}
