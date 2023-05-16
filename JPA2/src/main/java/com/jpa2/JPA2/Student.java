package com.jpa2.JPA2;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.annotation.Id;


@Entity
@Table(name="student")
public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id")
    Integer id;
    @Column(name="student_name")
    String name;

    public Student(){

    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

