package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeMgmtService
{
  public Iterable<Employee> getAllEmployess();
  
  String registerEmployee(Employee emp);
  
  public Employee getemployeeByid(Integer id);
  
  public String UpdateEmployee(Employee emp);
  
  public String DeleteEmployee(Integer id);
}
