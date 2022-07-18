package com.example.spring_hospital;

import com.example.spring_hospital.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringHospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHospitalApplication.class, args);
    }


}
