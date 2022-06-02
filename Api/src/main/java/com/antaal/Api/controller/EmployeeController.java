package com.antaal.Api.controller;

import com.antaal.Api.model.Employee;
import com.antaal.Api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
@GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployes();
    }


}
