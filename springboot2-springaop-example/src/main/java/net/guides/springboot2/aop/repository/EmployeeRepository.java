package net.guides.springboot2.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.aop.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository < Employee, Long > {

}