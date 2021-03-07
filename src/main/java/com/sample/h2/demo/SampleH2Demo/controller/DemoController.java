package com.sample.h2.demo.SampleH2Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.h2.demo.SampleH2Demo.model.Department;
import com.sample.h2.demo.SampleH2Demo.model.Student;

@RestController
public class DemoController {

	
    //private RestTemplate restTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/student")
	public List<Student> getStudents() {
		return jdbcTemplate.query("select * from Student", new BeanPropertyRowMapper<>(Student.class));
	}
	
	
	@GetMapping("/department")
	public List<Department> getDepartments() {
		return jdbcTemplate.query("select * from department", new BeanPropertyRowMapper<>(Department.class));
	}
	
	
}
