package com.example.Insertion_into_database.Controller;

import com.example.Insertion_into_database.Modal.Employee;
import com.example.Insertion_into_database.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService empservice;

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {
        return empservice.getEmployees();
    }
    @PostMapping("/addEmployee")
    public Employee addEmployee(Employee employee) {
        return empservice.saveEmployee(employee);
    }
}
