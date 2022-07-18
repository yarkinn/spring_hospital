package com.example.spring_hospital.dao;

import com.example.spring_hospital.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
