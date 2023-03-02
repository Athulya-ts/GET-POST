package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class ApiService {
	@Autowired
	EmployeeRepo emp;

	public Employee postDetails(Employee e) {
		return emp.save(e);
	}
	public List<Employee> getDetails(){
		return emp.findAll();
	}


}
