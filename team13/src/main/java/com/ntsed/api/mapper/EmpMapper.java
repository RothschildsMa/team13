package com.ntsed.api.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ntsed.api.vo.EmployeeVo;



@Mapper
public interface EmpMapper {
	EmployeeVo queryEmpById(String employeeId);
	String queryEmpMaxId();
	Integer insertEmp(EmployeeVo employeeVo);
	Integer updateEmp(EmployeeVo employeeVo);


}
