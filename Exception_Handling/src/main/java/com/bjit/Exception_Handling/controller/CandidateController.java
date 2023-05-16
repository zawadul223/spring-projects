package com.bjit.Exception_Handling.controller;

import com.bjit.Exception_Handling.exception.CandidateNotFoundException;
import com.bjit.Exception_Handling.model.Candidate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    @GetMapping("/get-candidate-info/{id}")
    public ResponseEntity<Object> getCandidateInfo(@PathVariable Integer id)  {
        if(id==2002) {
            Candidate candidate = new Candidate("Zawad");
            return new ResponseEntity<Object>(candidate, HttpStatus.OK);
        }
        else{
            throw new CandidateNotFoundException("Candidate not found!!");
        }
    }
}
