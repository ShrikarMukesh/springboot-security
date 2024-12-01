package com.springsecurity.controller;

import com.springsecurity.pets.api.CertificateApi;
import com.springsecurity.pets.model.CreateCertificateRequest;
import com.springsecurity.pets.model.CreateCertificateResponse;
import com.springsecurity.service.CertificateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class CertificateController implements CertificateApi {

    CertificateService certificateService;

    @Override
    public Mono<ResponseEntity<CreateCertificateResponse>> createCert(final Mono<CreateCertificateRequest> createCertificateRequest,
                                                                      final ServerWebExchange exchange){
        return createCertificateRequest.flatMap(
                request ->  certificateService.createCustomeCertificate(request));


    }

}
