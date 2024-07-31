package com.example.Insertion_into_database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Insertion_into_database.Modal.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {


}
