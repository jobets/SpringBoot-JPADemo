package com.learn.spring.jpa.jpademo.service;

import com.learn.spring.jpa.jpademo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
