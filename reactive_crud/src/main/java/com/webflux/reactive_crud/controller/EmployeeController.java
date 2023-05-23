package com.webflux.reactive_crud.controller;

import com.webflux.reactive_crud.dto.EmployeeDto;
import com.webflux.reactive_crud.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<EmployeeDto> saveRequestedEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.saveEmployee(employeeDto);
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<EmployeeDto> getById(@PathVariable String id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<EmployeeDto> getByName(@PathVariable String name){
        return employeeService.getByEmployeeName(name);
    }


    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> deleteEmployee(@PathVariable String id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public Flux<EmployeeDto> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PutMapping("/update/{id}")
    public Mono<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto,
                                            @PathVariable("id") String employeeId){
        return employeeService.updateEmployee(employeeDto, employeeId);
    }
}
