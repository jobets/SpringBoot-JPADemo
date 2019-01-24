package com.learn.spring.jpa.jpademo;

import com.learn.spring.jpa.jpademo.entity.Employee;
import com.learn.spring.jpa.jpademo.service.EmployeeDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOServiceCommandLineRunner implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(EmployeeDAOServiceCommandLineRunner.class);

    @Autowired
    private EmployeeDAOService employeeDAOService;

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee("James", "Engineer");
        long insertId = employeeDAOService.insert(emp);
        logger.info("Emploee inserted : " + emp);
    }
}
