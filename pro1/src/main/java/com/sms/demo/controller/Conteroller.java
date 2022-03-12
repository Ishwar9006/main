package com.sms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.demo.entity.EmployeeData;
import com.sms.demo.service.EmpService;

@RestController
public class Conteroller {

	@Autowired
	EmpService empSerive;
	
	@PostMapping(value = "saveEmpData")
	public String saveEmp(Long id, String name, Double salary, String address) {
		EmployeeData e= new EmployeeData();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setAddress(address);
		empSerive.save(e);
		
		
		return "save employee done";
	}
}
