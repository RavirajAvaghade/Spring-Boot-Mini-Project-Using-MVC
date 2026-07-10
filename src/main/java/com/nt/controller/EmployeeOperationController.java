package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationController 
{
	@Autowired
	private IEmployeeMgmtService service;
	
   @GetMapping("/Home")
   public String ShowHomePage()
   {
	   return "Show_Home";
   }
   @GetMapping("/report")
   public String ShowEmployeeReport(@ModelAttribute("emp")Employee emp,Map<String,Object>map)
   {
	   System.out.println("EmployeeOperationController.ShowEmployeeReport()");
	   System.out.println("Model attribute are : "+emp);
	   Iterable<Employee> itemps=service.getAllEmployess();
	   map.put("empsList", itemps);
	   return "Show_Employee_Report";
	   
   }
   @GetMapping("/register")
   public String RegisterEmployee(@ModelAttribute("emp")Employee emp,Map<String,Object>map)
   {
	
	return "register_employee";
	   
   }
   @PostMapping("/register")
   public String SaveEmployee(@ModelAttribute("emp")Employee emp,Map<String,Object>map)
   {
	   String msg = service.registerEmployee(emp);
	   map.put("resultMsg", msg);
	   
	   return "register_employee";
   }
   @GetMapping("/emp_edit")
   public String ShowEditPage(@RequestParam("no")Integer id,@ModelAttribute("emp")Employee emp)
   {
	 Employee employee = service.getemployeeByid(id);
	 
	 emp.setEid(employee.getEid());
	 emp.setEname(employee.getEname());
	 emp.setJob(employee.getJob());
	 emp.setSalary(employee.getSalary());
	 emp.setDno(employee.getDno());
	 
	return "edit_employee";
	   
   }
   @PostMapping("/emp_edit")
   public String UpdateEmployee(@ModelAttribute("emp")Employee emp,Map<String,Object>map)
   {
	 String msg = service.UpdateEmployee(emp);
	 Iterable<Employee> list = service.getAllEmployess();
	 map.put("empsList", list);
	 map.put("resultMsg", msg);
	 
	return "Show_Employee_Report";
	   
   }
   @GetMapping("/edit_delete")
   public String deleteEmployee(@RequestParam("no")Integer id,RedirectAttributes attrs)
   {
	   String msg = service.DeleteEmployee(id);
	   attrs.addFlashAttribute("resultMsg",msg);
	   return "redirect:/report";
	  
   }
   
   
   
}
