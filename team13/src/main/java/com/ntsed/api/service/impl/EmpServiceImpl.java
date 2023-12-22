package com.ntsed.api.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntsed.api.mapper.EmpMapper;
import com.ntsed.api.service.EmpService;
import com.ntsed.api.vo.EmployeeVo;


@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpMapper empMapper;

	@Override
	public EmployeeVo queryEmpById(String employeeId) {
		return empMapper.queryEmpById(employeeId);
	}

	@Override
	public String queryEmpMaxId() {
		return empMapper.queryEmpMaxId();
	}

	@Override
	public Integer insertEmp(EmployeeVo employeeVo) {
		return empMapper.insertEmp(employeeVo);
	}

	@Override
	public Integer updateEmp(EmployeeVo employeeVo) {
		return empMapper.updateEmp(employeeVo);
	}

}
