package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepository;
@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService
{
	@Autowired
	private IEmployeeRepository repo;

	public Iterable<Employee> getAllEmployess() 
	{
		return repo.findAll();
		
	}

	@Override
	public String registerEmployee(Employee emp) 
	{
		repo.save(emp);
		return "Employee Save Succesfully";
	}

	@Override
	public Employee getemployeeByid(Integer id) 
	{
		return repo.findById(id).orElse(null);
		
	}

	@Override
	public String UpdateEmployee(Employee emp) 
	{
		repo.save(emp);
		return emp.getEid()+" Employee Update Succesfully";
	}

	@Override
	public String DeleteEmployee(Integer id) 
	{
		repo.deleteById(id);
		return "Employee "+id+" Delete Succesfully";
	}

}
