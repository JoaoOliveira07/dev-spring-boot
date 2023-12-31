package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members")//DENTRO DO JPARepository temos a Entidade e o tipo do ID
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
