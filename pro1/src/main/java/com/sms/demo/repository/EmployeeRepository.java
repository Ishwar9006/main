package com.sms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.demo.entity.EmployeeData;

public interface EmployeeRepository extends JpaRepository<EmployeeData, Long> {

}
