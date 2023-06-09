package com.example.mufasa.registration;

import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private  RegistrationService registrationService;

    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
