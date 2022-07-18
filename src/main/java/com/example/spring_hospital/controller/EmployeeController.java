package com.example.spring_hospital.controller;

import com.example.spring_hospital.dao.EmployeeRepository;
import com.example.spring_hospital.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {


    private final EmployeeRepository employeeRepository;


    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
        public List<Employee> getEmployees() {
            return (List<Employee>) employeeRepository.findAll();
        }

        @PostMapping("/employees")
        void addEmployee(@RequestBody Employee employee) {
            employeeRepository.save(employee);
        }

        @DeleteMapping("/employees")
        public void removeEmployee( int id) {
        employeeRepository.deleteById(id);


    }
}
