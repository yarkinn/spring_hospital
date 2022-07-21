package com.example.spring_hospital.controller;

import com.example.spring_hospital.dao.EmployeeRepository;
import com.example.spring_hospital.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
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

    @DeleteMapping(path = "/employees/{employeeId}")
    public void deleteEmployee( @PathVariable("employeeId") int employeeId){
        try {
            employeeRepository.deleteById(employeeId);
        }catch (Exception e){
            System.out.println("Employee doesn't exist");
        }

    }
}
