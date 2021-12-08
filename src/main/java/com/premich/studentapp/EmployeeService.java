package com.premich.studentapp;

import com.premich.studentapp.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;


    }
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployees(){
       return employeeRepo.findAll();

    }
    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);

    }
    public void deleteEmployee(Long id){
       employeeRepo.deleteEmpolyeeById(id);

    }
    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id);

    }
}

