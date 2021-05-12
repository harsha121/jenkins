package com.harsha.jenkins.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class StudentController {
	
	
	List<String> students = Arrays.asList("Sri Harsha","Jiraiya");
	@GetMapping("/students")
	public List<String> getStudents(){
		return students;
	}
	
	@RequestMapping("/students/{studentId}")
	public List<String> getStudent(@PathVariable String studentId){
		return students;
	}
}
