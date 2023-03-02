package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService serv;
	@GetMapping("/showDetails")
	public List<Employee> showDetails(){
		return serv.getDetails();
	}
	@PostMapping("/addDetails")
	public Employee addDetails(@RequestBody Employee st)
	{
		return serv.postDetails(st);
	}

}

	