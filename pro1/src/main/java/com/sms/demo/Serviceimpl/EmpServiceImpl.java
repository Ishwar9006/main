package com.sms.demo.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.demo.entity.EmployeeData;
import com.sms.demo.repository.EmployeeRepository;
import com.sms.demo.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmployeeRepository eRepo;
	
	@Override
	public void save(EmployeeData e) {
		// TODO Auto-generated method stub
		eRepo.save(e);
	}

}
