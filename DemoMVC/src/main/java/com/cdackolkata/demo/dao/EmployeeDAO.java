package com.cdackolkata.demo.dao;

import java.util.List;

import com.cdackolkata.demo.model.EmployeeVO;

public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}