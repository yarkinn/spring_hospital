package com.example.spring_hospital.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private int id;
    @Column( name = "name")
    private String name;
    @Column ( name = "salary")
    private Integer salary;
    @Column(name = "job")
    private String job;
    @Column ( name = "hours")
    private Integer hours;


    public Employee(String name,String job, int salary, int hours) {
        this.job = job;
        this.name = name;
        this.salary = salary;
        this.hours = hours;
    }

    public Employee() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(salary, that.salary) && Objects.equals(job, that.job) && Objects.equals(hours, that.hours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, job, hours);
    }

    @Override
    public String toString() {
        return
                "Id: " + id +
                        "\nName: " + name  +
                        "\nSalary: " + salary +
                        "\nJob: " + job +
                        "\nHours: " + hours+ "\n";
    }



}
