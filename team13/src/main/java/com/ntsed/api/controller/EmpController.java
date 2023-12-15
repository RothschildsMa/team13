package com.ntsed.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntsed.api.base.ResultInfo;
import com.ntsed.api.service.EmpService;
import com.ntsed.api.vo.EmployeeVo;


@RestController
@RequestMapping("employee")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping("queryEmpById")
	public EmployeeVo queryEmpById(String employeeId){
		return empService.queryEmpById(employeeId);
		
	}
	
	@RequestMapping("queryEmpMaxId")
    public ResultInfo<EmployeeVo> queryEmpById() {
        String maxId = empService.queryEmpMaxId();
        EmployeeVo employeeVo = new EmployeeVo();
        employeeVo.setEmployeeId(String.valueOf(Long.parseLong(maxId)+1));
        return new ResultInfo<EmployeeVo>().setResult(employeeVo);
    }
	
	
	@RequestMapping("addOrUpdateEmp")
    public ResultInfo<Void> addOrUpdateEmp(@RequestBody EmployeeVo employeeVo) {
        Integer result = null;
        String maxId = empService.queryEmpMaxId();
        String maxIdTemp = String.valueOf(Long.parseLong(maxId)+1);
        if (maxIdTemp.equals(employeeVo.getEmployeeId())) {
        	result = empService.insertEmp(employeeVo);
        } else {
        	result = empService.updateEmp(employeeVo);
        }

        if (result != null && !result.equals(0)) {
            return new ResultInfo<>();
        } else {
            return new ResultInfo<>(1000, "操作失败!");
        }
    }
	
}
