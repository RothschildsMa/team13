package com.ntsed.api.entity;

import java.sql.Date;

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
    private int delFlg;
    private Date createDate;
    private String createUser;
    private Date updateDate;
    private String updateUser;
    private int genderId;
    private String age;
    private String emailAddress;
    private String iphone;
    private Date startDay;

}
