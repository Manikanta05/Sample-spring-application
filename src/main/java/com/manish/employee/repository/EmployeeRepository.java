package com.manish.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
 
}
