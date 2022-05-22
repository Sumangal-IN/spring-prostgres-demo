package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return service.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }
}
