package com.ntsed.api.service;


import com.ntsed.api.vo.EmployeeVo;


public interface EmpService {
	EmployeeVo queryEmpById(String employeeId);
    String queryEmpMaxId();
    Integer insertEmp(EmployeeVo employeeVo);
    Integer updateEmp(EmployeeVo employeeVo);

}
