package com.jpa2.JPA2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRep extends CrudRepository<Student, Integer> {
    //Student findById(Integer id);

    Iterable <Student> findAll();

}
