package com.example.demo.ExceptionHandling;

import com.example.demo.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class MyApplicationExceptionHandler {
    /**
     * you are saying to springboot whenever MethodArgumentNotValidException raised redirect to invalidParameterValidation. So you have to use ExceptionHandler
     * Along with error message, we have to send http status also so iam using @Responsestatus
     * @ControllerAdvice — tells Spring this class will provide centralized exception handling across all controller classes
     * @ResponseBody — ensures that the response from the methods is automatically converted to JSON or XML (just like in @RestController).
     * @RestControllerAdvice is used to handle exceptions and return JSON responses from a centralized place. so combination of controller advice and response body.
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> invalidParameterValidation(MethodArgumentNotValidException methodArgumentNotValidException) {
        Map<String,String> errorMap = new HashMap<>();
        methodArgumentNotValidException.getBindingResult().getFieldErrors().forEach(error -> {
            errorMap.put(error.getField(),error.getDefaultMessage());
        });
        return errorMap;
    }

    /**
     * If user service throws user not found exception, this will provide user not found error to user/frontend. if you wont handle here,in logs it will print error and gives 500 to user/frontend.
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String,String> userNotFoundInDB(UserNotFoundException userNotFoundException) {
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("errorMessage is : ",userNotFoundException.getMessage());
        return errorMap;
    }
}
