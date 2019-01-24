package com.learn.spring.jpa.jpademo;

import com.learn.spring.jpa.jpademo.entity.Employee;
import com.learn.spring.jpa.jpademo.service.EmployeeDAOService;
import com.learn.spring.jpa.jpademo.service.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepositoryCommandLineRunner implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(EmployeeRepositoryCommandLineRunner.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee("John", "Architect");
        employeeRepository.save(emp);
        logger.info("Emploee inserted : " +emp);

        //Similarly we can use other methods from the employeeRepository
        employeeRepository.findAll();
    }
}
