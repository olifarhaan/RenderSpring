package com.olifarhaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olifarhaan.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
