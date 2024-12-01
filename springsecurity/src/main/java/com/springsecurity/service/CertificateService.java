package com.springsecurity.service;

import com.springsecurity.pets.model.CreateCertificateRequest;
import com.springsecurity.pets.model.CreateCertificateResponse;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public class CertificateService {

    DeviceIdentityValidator deviceIdentityValidator;
    public Mono<ResponseEntity<CreateCertificateResponse>> createCustomeCertificate(CreateCertificateRequest request) {

        return null;
    }
}
