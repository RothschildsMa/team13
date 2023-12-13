package com.ntsed.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String employeeId;
    private String employeeName;
    private String password;
    private String deptId;
    private Integer delFlg;
    private String createDate;
    private String createUser;
    private String updateDate;
    private String updateUser;
    private String gender;
    private String age;
    private String startDay;
    private String emailAddress;
    private String phoneNumber;
    
    
    

}
