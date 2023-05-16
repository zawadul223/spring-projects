package com.bjit.JDBC.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;
    @PostMapping("/")
    public String addStudent(@RequestBody Student student){
        studentRepo.save(student);
        return "Student added";
    }
}
