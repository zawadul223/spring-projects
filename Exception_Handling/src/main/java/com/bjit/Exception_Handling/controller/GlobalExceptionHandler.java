package com.bjit.Exception_Handling.controller;

import com.bjit.Exception_Handling.exception.AdminNotFoundException;
import com.bjit.Exception_Handling.exception.CandidateNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({AdminNotFoundException.class, CandidateNotFoundException.class})
    public ResponseEntity<Object> returnNotFoundException(Exception ex) {
        if (ex instanceof AdminNotFoundException) {
            return new ResponseEntity<Object>
                    (ex.getMessage(), HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Object>
                    (ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
