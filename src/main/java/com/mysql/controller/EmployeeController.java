package com.mysql.controller;

import com.mysql.EmployeeRepository;
import com.mysql.entitys.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeRepository repository;

    @RequestMapping(name = "reg",method = RequestMethod.POST)
    public Employee registerEmployee(@RequestBody Employee employee){
        return repository.save(employee);
    }

}
