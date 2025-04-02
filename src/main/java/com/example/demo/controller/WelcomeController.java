package com.example.demo.controller;

import com.example.demo.dto.AuthUserDTO;
import com.example.demo.service.CustomUserDetailsService;
import com.example.demo.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {
    @Autowired
    private JwtService jwtService;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

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
     * @EnableWebSecurity
     * @EnableMethodSecurity
     * public class SecurityConfiguration {}
     *
     * Password Encoder won't compare plain text passwords. it will compare Hash of password. generally in DB, the password should be saved with Hash protected.
     * for now iam using equals method, while register itself you have to encode and store. then passwordEncoder.matches method calculates user given plain text hash with db hash.
     */
    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticationToken(@RequestBody AuthUserDTO authUserDTO) {
        try {
            UserDetails userDetails = customUserDetailsService.loadUserByUsername(authUserDTO.getUserName());

            //passwordEncoder.matches(authUserDTO.getPassWord(),userDetails.getPassword()) - you have to use this one instead of equals.
            if (authUserDTO.getPassWord().equals(userDetails.getPassword())) {
                String jwtToken = jwtService.generateToken(authUserDTO.getUserName());
                return ResponseEntity.ok(jwtToken);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
            }
        } catch (org.springframework.security.core.userdetails.UsernameNotFoundException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred during authentication.");
        }
    }
}
