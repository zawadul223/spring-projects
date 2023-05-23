package com.webflux.reactive_crud.services;

import com.webflux.reactive_crud.dto.EmployeeDto;
import com.webflux.reactive_crud.entity.Employee;
import com.webflux.reactive_crud.mapper.EmployeeMapper;
import com.webflux.reactive_crud.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Override
    public Mono<EmployeeDto> saveEmployee(EmployeeDto employeedto){
        Employee employee = EmployeeMapper.maptoEmployee(employeedto);
        Mono<Employee> employeeMono = employeeRepository.save(employee);
        return employeeMono.map(employeeEntity -> EmployeeMapper.maptoEmployeeDto(employeeEntity));
    }


    @Override
    public Mono<EmployeeDto> getEmployeeById(String id){
        Mono <Employee> empById = employeeRepository.findById(id);
        return empById.map(empEntity -> EmployeeMapper.maptoEmployeeDto(empEntity));
    }

    @Override
    public Mono<Void> deleteEmployee(String id){

         return employeeRepository.deleteById(id);

    }

    @Override
    public Flux<EmployeeDto> getAllEmployees() {

        Flux<Employee> employeeFlux  = employeeRepository.findAll();
        return employeeFlux
                .map((employee) -> EmployeeMapper.maptoEmployeeDto(employee))
                .switchIfEmpty(Flux.empty());
    }
    @Override
    public Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto, String employeeId) {

        Mono<Employee> employeeMono = employeeRepository.findById(employeeId);

        return employeeMono.flatMap((existingEmployee) -> {
            existingEmployee.setName(employeeDto.getName());
            return employeeRepository.save(existingEmployee);
        }).map((employee -> EmployeeMapper.maptoEmployeeDto(employee)));
    }

    @Override
    public Mono<EmployeeDto> getByEmployeeName(String name){
        Mono <Employee> empById = employeeRepository.findByName(name);
        return empById.map(empEntity -> EmployeeMapper.maptoEmployeeDto(empEntity));
    }
}
