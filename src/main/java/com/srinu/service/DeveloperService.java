package com.srinu.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.srinu.model.Developer;

public interface DeveloperService {
	 public List <Developer> getAllEmployees();
	 
	 public ResponseEntity < Developer > getEmployeeById(@PathVariable(value = "id") int developerId);
	 
	 public Developer createEmployee(@RequestBody Developer developer);
	 
	 public String updateEmployee(@PathVariable(value = "id") int developerId,@RequestBody Developer developerDetails);
	 
	 public String deleteEmployee(@PathVariable(value = "id") int developerId);

}
