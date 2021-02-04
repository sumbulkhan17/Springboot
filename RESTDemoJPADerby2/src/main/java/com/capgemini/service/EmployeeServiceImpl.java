package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.repository.EmployeeRepository;
import com.capgemini.beans.Employee;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public Optional<Employee> getEmployeeById(String empId) {
		return employeeRepository.findById(empId);
	}
	
	public void updateEmployee(Employee employee,String empId) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(String empId) {
		employeeRepository.deleteById(empId);
	}

}
