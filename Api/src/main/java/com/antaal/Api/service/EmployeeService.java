package com.antaal.Api.service;

import com.antaal.Api.model.Employee;
import com.antaal.Api.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Optional<Employee> getEmploye(final Long id){
        return employeeRepository.findById(id);
    }
    public Iterable<Employee> getEmployes(){
        return employeeRepository.findAll();
    }
    public void deleteEmploye(final Long id){
       employeeRepository.deleteById(id);
    }
    public Employee saveEmploye(Employee employe){
        Employee savedEmploye = employeeRepository.save(employe);
        return savedEmploye;
    }
}
