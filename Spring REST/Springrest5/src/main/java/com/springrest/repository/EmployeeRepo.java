package com.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    public Employee findById(int id);
}