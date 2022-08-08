package com.manish.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manish.employee.model.Employee;
import com.manish.employee.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repo;

	@GetMapping("/")
	public String hello() {
		return "Hello world!!";
	}
	
	@PostMapping("/emp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
		return new ResponseEntity<Employee>(repo.save(emp),HttpStatus.OK);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployees(){
		return new ResponseEntity<List<Employee>>(repo.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id){
        Optional<Employee> findById = repo.findById(id);
        Employee emp = null;
        if(findById.isPresent()) {
            emp = findById.get();
        }
        return new ResponseEntity<Employee>(emp,HttpStatus.OK);
    }
	
}
