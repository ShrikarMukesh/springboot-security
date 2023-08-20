package com.security.auth;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

  private final AuthenticationService service;

  /**
   * Handles the user registration process.
   *
   * <p> This endpoint accepts a POST request with user registration details in the body.
   * Upon successful registration, it returns an authentication response.
   *
   * @param request The user registration details encapsulated in a RegisterRequest object.
   * @return ResponseEntity containing an AuthenticationResponse object
   *         indicating successful registration and possibly containing token.
   *
   *
   * @endpoint POST /register
   */
  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(
      @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.register(request));
  }

  /**
   * Handles user authentication.
   *
   * <p>This endpoint accepts a POST request with user authentication credentials in the body.
   * Upon successful authentication, it returns an authentication response.
   *
   * @param request The user authentication credentials encapsulated in an AuthenticationRequest object.
   * @return ResponseEntity containing an AuthenticationResponse object
   *         indicating successful authentication and possibly containing relevant details
   *         (e.g., token, user roles).
   *
   * @endpoint POST /authenticate
   */
  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
    return ResponseEntity.ok(service.authenticate(request));
  }

  @PostMapping("/refresh-token")
  public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
    service.refreshToken(request, response);
  }
}
