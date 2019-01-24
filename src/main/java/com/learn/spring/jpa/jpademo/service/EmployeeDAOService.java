package com.learn.spring.jpa.jpademo.service;

import com.learn.spring.jpa.jpademo.entity.Employee;
import org.springframework.orm.jpa.EntityManagerFactoryUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
@Transactional
public class EmployeeDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(Employee employee){
        entityManager.persist(employee);
        return employee.getId();
    }
}
