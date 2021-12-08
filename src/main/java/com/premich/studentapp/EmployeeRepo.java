package com.premich.studentapp;

import com.premich.studentapp.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmpolyeeById(Long id);

    Employee findEmployeeById(Long id);
}
