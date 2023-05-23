package com.webflux.reactive_crud.services;

import com.webflux.reactive_crud.dto.EmployeeDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface EmployeeService {
    Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto);

    Mono<EmployeeDto> getEmployeeById(String id);

    Mono<Void> deleteEmployee(String id);

    Flux<EmployeeDto> getAllEmployees();

    Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto, String employeeId);

    Mono <EmployeeDto> getByEmployeeName(String name);
}

