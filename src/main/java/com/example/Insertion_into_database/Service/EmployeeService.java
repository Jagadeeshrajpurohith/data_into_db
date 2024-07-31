package com.example.Insertion_into_database.Service;

import com.example.Insertion_into_database.Modal.Employee;
import com.example.Insertion_into_database.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


    @Service
    public class EmployeeService {
        private List<Employee> employees = new ArrayList<>();
        @Autowired
        private EmployeeRepository empRepository;

        public List<Employee> getEmployees() {
            return empRepository.findAll();
        }

        public Employee saveEmployee(Employee employee) {
            return empRepository.save(employee);

        }
    }

