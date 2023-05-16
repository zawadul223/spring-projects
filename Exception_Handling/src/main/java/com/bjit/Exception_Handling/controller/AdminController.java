package com.bjit.Exception_Handling.controller;

import com.bjit.Exception_Handling.exception.AdminNotFoundException;
import com.bjit.Exception_Handling.exception.CandidateNotFoundException;
import com.bjit.Exception_Handling.model.Admin;
import com.bjit.Exception_Handling.model.Candidate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/get-admin-info/{id}")
    public ResponseEntity<Object> getAdminInfo(@PathVariable Integer id)  {
        if(id==2001) {
            Admin admin = new Admin("BJIT Admin");
            return new ResponseEntity<Object>(admin, HttpStatus.OK);
        }
        else{
            throw new AdminNotFoundException("Admin not found");
        }
    }
//    @GetMapping("/get-candidate-info/{id}")
//    public ResponseEntity<Object> getCandidateInfo(@PathVariable Integer id)  {
//        if(id==2002) {
//            Candidate candidate = new Candidate("Zawad");
//            return new ResponseEntity<Object>(candidate, HttpStatus.OK);
//        }
//        else{
//            throw new CandidateNotFoundException("Candidate not found!!");
//        }
//    }

//    @ExceptionHandler({AdminNotFoundException.class})
//    public ResponseEntity<Object> returnNotFoundException(Exception ex) {
//        if (ex instanceof AdminNotFoundException) {
//            return new ResponseEntity<Object>
//                    (ex.getMessage(), HttpStatus.NOT_FOUND);
//        }
//        else{
//            return new ResponseEntity<Object>
//                    (ex.getMessage(), HttpStatus.NOT_FOUND);
//        }
//    }
}
