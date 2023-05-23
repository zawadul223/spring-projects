package com.webflux.reactive_crud.mapper;

import com.webflux.reactive_crud.dto.EmployeeDto;
import com.webflux.reactive_crud.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto maptoEmployeeDto(Employee employee){
        return new EmployeeDto(employee.getId(), employee.getName());
    }

    public static Employee maptoEmployee(EmployeeDto employeeDto){
        return new Employee(employeeDto.getId(), employeeDto.getName());
    }
}
