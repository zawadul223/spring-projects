package com.bjit.Exception_Handling.exception;

public class CandidateNotFoundException extends RuntimeException{
    public CandidateNotFoundException(String message) {
        super(message);
    }
}
