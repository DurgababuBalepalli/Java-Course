package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.models.User;
import com.example.demo.service.UserService;
import com.zaxxer.hikari.HikariDataSource;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/welcome")
    public String hello() {
        return "welcome......";
    }

    /**
     * Inorder to validate userRequest DTO you have to use @Valid, otherwise all mensioned validations will be skipped in DTO
     * You will receive the following error if you pass invalid data Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework
     * Till now we have validated data, now we have to handle the exception, we have to provide valid error to the user. so whenever you receive MethodArgumentNotValidException we  have to handle it. check MyApplicationExceptionHandler
     */
    @PostMapping("/createUser")
    public ResponseEntity<User> registerUser(@RequestBody @Valid UserRequest userRequest) {
        User user = userService.saveUser(userRequest);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getALlUsers());
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) throws UserNotFoundException {
        return ResponseEntity.ok(userService.getUser(id));
    }
}
