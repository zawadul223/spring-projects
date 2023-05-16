package com.accademy.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findBySecondName(String lastName);

    Account findByAccountId(long id);

    Iterable<Account> findAll();






}
