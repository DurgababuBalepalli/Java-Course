package com.example.demo.controller;

import com.example.demo.dto.AuthUserDTO;
import com.example.demo.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {
    @Autowired
    private JwtService jwtService;

    @GetMapping("/welcome")
    public String hello() {
        return "welcome......";
    }

    /**
     * user can get access token only if we can bypass this method. otherwise to use
     * authenticationToken method also you should provide token. so first user is able to get token through
     * authenticationToken method, then using that token user able to access remaining methods.
     * This method alone can't restrict access. it just gives an access.
     * you should required security config class.there you have to bypass this method.
     * iam talking about below one
     * @Configuration
     *          @EnableWebSecurity
     *          @EnableMethodSecurity
     *          public class SecurityConfiguration {}
     */
    @PostMapping("/authenticate")
    public String authenticationToken(@RequestBody AuthUserDTO authUserDTO) {
        String jwtToken = jwtService.generateToken(authUserDTO.getUserName());
        return jwtToken;
    }
}
