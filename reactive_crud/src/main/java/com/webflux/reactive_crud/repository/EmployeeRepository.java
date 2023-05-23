package com.webflux.reactive_crud.repository;

import com.webflux.reactive_crud.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
    Mono<Employee> findByName(String name);
}
