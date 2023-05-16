package com.jpa2.JPA2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRep studentRep;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentRep.save(student);
        return "Student added";
    }

//    @GetMapping("/id")
//    public Student getById(@RequestParam Integer id){
//        return studentRep.findById(id);
//    }
}
